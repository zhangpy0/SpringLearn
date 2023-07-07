package com.zhangpy.springLearn.bean;


public class User {
    private long id;
    private String username;
    private String password;
    private String email;

    public String getPassword() {
        return password;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User(long id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password=password;
        this.email=email;
    }

    public User(String username, String password, String email) {
        this.id = 0;

        this.username = username;
        this.password=password;
        this.email=email;
    }

    public User() {
        this.id = 0;
        this.username = "";
        this.password="";
        this.email="";
    }

    @Override
    public String toString(){
        return "id: "+this.id+" username: "+this.username+" password: "+this.password+" email: "+this.email;
    }
}

