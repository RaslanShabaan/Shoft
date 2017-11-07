package com.arch.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Register", catalog = "Boot")
public class Register {

	
	private String Mail;
	private String Name;
	private String Phone;
	private String Pass;

	
	public Register(){}
	public Register(String Mail){this.Mail=Mail;}
	public Register(String Mail,String Name,String Phone,String Pass){
        this.Mail=Mail;
		this.Name=Name;
		this.Phone=Phone;
		this.Pass=Pass;
	}
	
	@Id
	@Column(name = "Mail")
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}

	@Column(name = "Name")
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	@Column(name = "Phone")
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	
	
	@Column(name = "Pass")
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	
}
