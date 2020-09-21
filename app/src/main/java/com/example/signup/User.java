package com.example.signup;

public class User {
    private String userName;
    private  String userMessage;
    private  int userImage;

    public User() {
    }

    public User(String userName, String userMessage, int userImage) {
        this.userName = userName;
        this.userMessage = userMessage;
        this.userImage = userImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public int getUserImage() {
        return userImage;
    }

    public void setUserImage(int userImage) {
        this.userImage = userImage;
    }
     public String toString(){
        return "User Name is: "+userName+"\nMessage is: "+userMessage;
     }
}
