package com.arch.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "authorities", catalog = "Boot")
public class authorities {

    @Id
    private String username;
    private String authority;

    public authorities(){}
    public authorities(String username){

        this.username=username;
    }

    public authorities(String username,String authority){

        this.username=username;
        this.authority=authority;
    }


    @Column(name = "username")
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name = "authority")
    public String getAuthority() {
        return authority;
    }
    public void setAuthority(String authority) {
        this.authority = authority;
    }

}
