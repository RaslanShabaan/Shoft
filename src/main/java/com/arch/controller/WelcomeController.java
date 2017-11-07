package com.arch.controller;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.arch.Service.PostService;
import com.arch.Service.RegisterService;
import com.arch.Service.authoritiesService;
import com.arch.Service.usersService;


import com.arch.EncryptPassword;
import com.arch.Entities.*;
import com.arch.RandomV_Code.Random_Vcode;
import com.arch.SendMail.SendMail;

@Controller
public class WelcomeController {

	public static String Current_User;

	@Autowired
	RegisterService registerservice;

	@Autowired
	usersService usersservice;

	@Autowired
	authoritiesService authoritiesservice;

	@Autowired
	PostService postservice;

	@RequestMapping(value = "/")
	public ModelAndView Home() {

		ModelAndView modelAndView = new ModelAndView("Index");

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		Current_User = authentication.getName();

		return modelAndView;
	}

	@RequestMapping(value = "/Login")
	public ModelAndView Login(@RequestParam(name = "error", required = false) String error) {

		ModelAndView modelAndView = new ModelAndView("Login");
		if (error != null) {
			modelAndView.addObject("error", "Please Enter Correct Data :)");
		}
		return modelAndView;
	}

	// @RequestMapping(value = "/error" )
	// public ModelAndView error() {
	//
	// ModelAndView modelAndView = new ModelAndView("News");
	// return modelAndView;
	// }
	//

	// User Go To Register Page
	@RequestMapping(value = "/GoRegister", method = RequestMethod.GET)
	public ModelAndView GoRegister() {

		ModelAndView modelAndView = new ModelAndView("Register");
		return modelAndView;
	}

	
	// User Register & Send Him Mail & Save Reg Data & users and auths DB
	@RequestMapping(value = "/Register", method = RequestMethod.POST)
	public ModelAndView Register(@RequestParam("UMail") String UMail, @RequestParam("UName") String UName,
			@RequestParam("UPass") String UPass, @RequestParam("UPhone") String UPhone) {

		ModelAndView modelAndView = new ModelAndView("Login");

		Register register = new Register();
		users users = new users();
		authorities authorities = new authorities();

		SendMail sendmail = new SendMail();
		Random_Vcode Vcode = new Random_Vcode();
		String vcode = Vcode.Genetate();

		String Mail = sendmail.SendMail(UMail, UName, vcode);

		EncryptPassword E = new EncryptPassword();
		String Pss = E.Md5Password(UPass);
		if (Mail.equals("Doen")) {

			register.setMail(UMail);
			register.setName(UName);
			register.setPass(Pss);
			register.setPhone(UPhone);
			registerservice.InsertRegister(register);

			authorities.setAuthority("User");
			authorities.setUsername(UName);
			authoritiesservice.Insertauthorities(authorities);

			users.setEnabled(0);
			users.setV_Code(vcode);
			users.setPassword(Pss);
			users.setUsername(UName);
			usersservice.Insert(users);

			modelAndView.addObject("Reg", " Your Registration Is Doen Check Your Mail For Verification Your Login :) ");

		} else {
			modelAndView.addObject("Reg", "Some Thing Went Wrong Please Try Later :)");

		}

		
		return modelAndView;
	}

	// User Go To Register Page
	@RequestMapping(value = "/PostNews", method = RequestMethod.POST)
	public ModelAndView PostNews(@RequestParam("khaber") String khaber) {
		System.out.println("-------------------------------------");
		System.out.println(khaber);
		System.out.println(Current_User);
		
		 Post post=new Post();
		 post.setName(Current_User);
		 post.setPosts(khaber);
		 postservice.InsertPost(post);
		
		
		ModelAndView modelAndView = new ModelAndView("Index");
		return modelAndView;
	}

	
	// User Go To  Page
	@RequestMapping(value = "/SelectNews", method = RequestMethod.GET)
	public ModelAndView SelectNews(HttpSession sesson) {

		Post post = new Post();
		List<Post> News = postservice.All();
		ArrayList<String> cv = new ArrayList<String>();

		for (int t = 0; t < News.size(); t++) {
			cv.add(News.get(t).getName().toString());
			cv.add(News.get(t).getPosts().toString());

		}

		sesson.setAttribute("sesson", cv);
		System.out.println(cv);
		ModelAndView modelAndView = new ModelAndView("News");
		return modelAndView;
	}

	// return logout function
	@RequestMapping(value = "/Logout", method = RequestMethod.GET)
	public ModelAndView Logout(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("Login");

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}

		modelAndView.addObject("logout", "You Are Succesfully Loged Out :) ");
		System.out.println("-----------------------------");
		return modelAndView;
	}

	
	
	// Check V Code 
	@RequestMapping(value = "/Check")
	public ModelAndView Check(@RequestParam(value = "Vcode", required = false) String vcode) {

		ModelAndView modelAndView = new ModelAndView("Login");
		System.out.println(	vcode + "___________________________ ********************* _____________________________________");
	
		// update user enables status 
        users u =new users();
		u=usersservice.As(vcode);
if(u == null){
modelAndView.addObject("vcod","Mail Verhfication Doen Badlly You Can Not Log In Now Register First ... ");
}else{
	
	users ux =new users();
	ux.setEnabled(  1);
	ux.setPassword(	u.getPassword());
	ux.setUsername( u.getUsername());
	ux.setV_Code(   u.getV_Code());
	usersservice.Updatet(ux);

	modelAndView.addObject("vcod"," Mail Verhfication Doen You Can Log In Now ... ");
}
	
		return modelAndView;
	}

}