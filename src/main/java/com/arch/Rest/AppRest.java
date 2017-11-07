package com.arch.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.arch.Entities.Post;
import com.arch.Service.PostService;
import java.util.*;

import javax.websocket.server.PathParam;
@RestController
@RequestMapping("/RestPosts")
public class AppRest {

	@Autowired
	PostService postservice;
	
	// select all posts from db
	@RequestMapping("/AllPosts")
	public List<Post> AllPosts()
	{
			
		return postservice.All();
	}
	
	// select by id from db
	@RequestMapping("/Post/{Id}")
	public Post Post(@PathVariable("Id") int Id)
	{
			System.out.println(Id);
		return postservice.SelectPost(Id);
	}
	
	// insert in db
		@RequestMapping(value="/Post",method=RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE )
		public void Ins_Post(@RequestBody Post post)
		{
			System.out.println(post.getName()+"________________________________");
			postservice.InsertPost(post);
			
		}
		
}
