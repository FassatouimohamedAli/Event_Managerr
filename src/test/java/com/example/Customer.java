package com.example;

public class Customer {
    private String userName;
    private String password;

    public Customer(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public boolean isLogin(String userName, String password) {
        // Vérifie si les informations
        return this.userName.equals(userName) && this.password.equals(password);
    }
}
