package com.example.designpattern.lecture_baek._06_adapter._02_after.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);
}
