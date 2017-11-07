package com.arch.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arch.Entities.Register;


@Service
public class RegisterService {

	@Autowired
	com.arch.Dao.RegisterDao registerdao;

    public void InsertRegister(Register register) {

    	 registerdao.InsertRegister(register);
    }

    public Register SelectRegister(String Mail) {
 
    	return  registerdao.SelectRegister(Mail);

    }

    public void DeleteRegister(String Mail) {
    	 registerdao.DeleteRegister(Mail);
    }

    public void UpdateRegister(Register register) {
    	 registerdao.UpdateRegister(register);
 
    }
  
}


