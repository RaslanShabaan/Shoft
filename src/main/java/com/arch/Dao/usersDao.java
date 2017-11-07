package com.arch.Dao;

import com.arch.Entities.users;

import java.util.List;

public interface usersDao {

    public String Insert(users users);
    public String Delete(String username);
    public String Update(users users);
    public users Select(String username);
    public List<users> SelectAllUsers();

    public users SelectByVcode(String V_Code);

}
