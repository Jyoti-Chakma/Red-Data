package com.piedroid.redblood;

public class Users {

    String fullName, location, session, age, userName, blood, phone;

    public Users() {
    }

    public Users(String fullName, String location, String session, String age, String userName, String blood, String phone) {
        this.fullName = fullName;
        this.location = location;
        this.session = session;
        this.age = age;
        this.userName = userName;
        this.blood = blood;
        this.phone = phone;;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
