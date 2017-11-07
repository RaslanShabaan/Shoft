package com.arch.Dao;

import java.util.ArrayList;
import java.util.List;

import com.arch.Entities.*;

public interface PostDao {

	public void InsertPost(Post post);
	public Post SelectPost(int Id) ;
	public void DeletePost(int Id) ;
	public void UpdatePost(Post post);
	

	public List<Post> All();
	public ArrayList<String> AllP(int id,String Name);

}
