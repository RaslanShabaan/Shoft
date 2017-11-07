package com.arch.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arch.Dao.PostDao;
import com.arch.Entities.Post;

@Service
public class PostService {

	@Autowired
	com.arch.Dao.PostDao dao;

	public void InsertPost (Post post)
	{
		dao.InsertPost(post);
	}

	public Post SelectPost (int  Id)
	{
		return dao.SelectPost(Id);
	}
	
	public void DeletePost (int  Id)
	{
		dao.DeletePost(Id);
	}

	public void UpdatetPost (Post post)
	{
		dao.UpdatePost(post);
	}


	public List<Post> All ()
	{
			
	return dao.All();
	
	}


	public ArrayList<String> Allp (int id ,String Name)
	{
			
	return dao.AllP(id,Name);
	
	}

}
