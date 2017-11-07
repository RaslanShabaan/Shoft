package com.arch;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncryptPassword {

	
		   public static void main(String[] args) {
	        System.out.println(Md5Password("r"));
	    }
		   
	   
//	    public static String BCryptPassword(String password) {
//
//	        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//	        String hashedPassword = passwordEncoder.encode(password);
//
//	        return hashedPassword;
//
//	    }

	    public static String Md5Password(String password) {
	        Md5PasswordEncoder encoder = new Md5PasswordEncoder();
	        String hashedPass = encoder.encodePassword(password, null);

	        return hashedPass;

	    }
	
	

}
