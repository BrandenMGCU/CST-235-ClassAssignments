package com.register.bean;

public class RegisterBean {
    String Name;
    String EMail;
    String userName;
    String Address;
    String PhoneNumber;
    String password;

    public RegisterBean(String name, String email, String username, String address, String phonenumber, String password)
    {
        super();
        Name = name;
        EMail = email;
        this.userName = username;
        this.Address = address;
        this.PhoneNumber = phonenumber;
        this.password = password;
    }

    public RegisterBean() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phonenumber) {
        PhoneNumber = phonenumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEMail() {
        return EMail;
    }

    public void setEMail(String email) {
        EMail = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

}