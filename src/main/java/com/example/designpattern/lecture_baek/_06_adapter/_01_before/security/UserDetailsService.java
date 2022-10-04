package com.example.designpattern.lecture_baek._06_adapter._01_before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);
}
