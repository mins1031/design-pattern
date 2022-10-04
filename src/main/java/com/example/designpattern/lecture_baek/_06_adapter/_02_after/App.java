package com.example.designpattern.lecture_baek._06_adapter._02_after;

import com.example.designpattern.lecture_baek._06_adapter._02_after.security.LoginHandler;
import com.example.designpattern.lecture_baek._06_adapter._02_after.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("min", "password");
        System.out.println(login);
    }
}
