package com.arch.Dao;


import com.arch.Entities.authorities;

import java.util.List;

public interface authoritiesDao {

    public String Insertauthorities(authorities authorities);
    public String Deleteauthorities(String username);
    public String Updateauthorities(authorities authorities);
    public authorities Selectauthorities(String username);
    public List<authorities> SelectALLauthorities();
}
