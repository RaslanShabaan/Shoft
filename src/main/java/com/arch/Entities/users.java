package com.arch.Entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users", catalog = "Boot")
public class users {


    @Id
    private String username;
    private String password;
    private int enabled;
    private String V_Code;


    public users(){}
    public users(String username){
        this.username=username;
    }

    public users(String username,String password,int enabled,String UserEmail,String V_Code){

        this.username=username;
        this.password=password;
        this.enabled=enabled;
         this.V_Code=V_Code;
    }

    @Column(name = "V_Code")
    public String getV_Code() {
        return V_Code;
    }
    public void setV_Code(String v_Code) {
        V_Code = v_Code;
    }

    @Column(name = "enabled")
    public int getEnabled() {
        return enabled;
    }
    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name = "username")
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }



}
