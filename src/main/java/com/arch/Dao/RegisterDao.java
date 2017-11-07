package com.arch.Dao;

import com.arch.Entities.Register;

public interface RegisterDao {


	public void InsertRegister(Register register);
	public Register SelectRegister(String Mail) ;
	public void DeleteRegister(String Mail) ;
	public void UpdateRegister(Register register);

}
