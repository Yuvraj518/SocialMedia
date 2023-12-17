package com.example.emManagment.Exception;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(){
        super("User Not Found");
    }
}
