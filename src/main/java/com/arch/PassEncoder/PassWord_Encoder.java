package com.arch.PassEncoder;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

public class PassWord_Encoder {
	

    public String Md5Password(String password) {
        Md5PasswordEncoder encoder = new Md5PasswordEncoder();
        String encodedPass = encoder.encodePassword(password, null);

        return encodedPass;

    }
    
    
    public static void main(String [] args)
    {
   
    	System.out.println("'''''''''''''''''''''''''''''''''''''''''");
    	PassWord_Encoder encoder =new  PassWord_Encoder();
    	System.out.println(encoder.Md5Password("r"));
    
    
    }


}
