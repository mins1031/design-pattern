package com.example.designpattern._06_adapter._02_after;

import com.example.designpattern._06_adapter._02_after.security.UserDetails;
import com.example.designpattern._06_adapter._02_after.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account accountByUsername = accountService.findAccountByUsername(username);
        return null;
    }
}
