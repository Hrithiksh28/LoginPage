package com.example.loginpage.Model;

public class User {

    private  String username;
    private  String password;
    private  String PhoneNumber;

    public User() {

    }

    public User(String username, String password, String PhoneNumber) {
        this.username = username;
        this.password = password;
        this.PhoneNumber = PhoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
