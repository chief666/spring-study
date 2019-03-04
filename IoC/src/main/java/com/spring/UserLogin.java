package com.spring;

public class UserLogin {
    private User user;

    public UserLogin(User user) {
        this.user = user;
    }

    public UserLogin() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public boolean userlogin(User user){
        if (user.getAccount().equals("admin")&&user.getPassword().equals("111")){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "user=" + user +
                '}';
    }
}
