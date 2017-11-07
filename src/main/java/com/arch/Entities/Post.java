package com.arch.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Posts", catalog = "Boot")
public class Post {

	private int Id;
	private String Name;
    private String Posts;

    
    public Post(){}
    public Post(int Id){this.Id= Id;}
    public Post(int Id, String Name, String Posts){
    	this.Id= Id;
    	this.Name=Name;
    	this.Posts=Posts;
    	
    }
    
	@Id
	@GeneratedValue
	@Column(name = "Id")
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}

	@Column(name = "Name")
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	@Column(name = "Posts")
	public String getPosts() {
		return Posts;
	}
	public void setPosts(String posts) {
		Posts = posts;
	}

}
