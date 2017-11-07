package com.arch.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arch.Entities.Post;
import com.arch.Entities.users;

@Service
public class usersService {

	@Autowired
	com.arch.Dao.usersDao dao;


	public void Insert (users users)
	{
		dao.Insert(users);
	}

	public void Select (String  username)
	{
		dao.Select(username);
	}
	
	public void DeletePost (String  username)
	{
		dao.Delete(username);
	}

	public void Updatet (users users)
	{
		dao.Update(users);
	}

	public List<users> Allusers ()
	{
			
	return dao.SelectAllUsers();	
	}
	
	public users As (String V_Code)
	{
			
	return dao.SelectByVcode(V_Code);	
	}
	
}
