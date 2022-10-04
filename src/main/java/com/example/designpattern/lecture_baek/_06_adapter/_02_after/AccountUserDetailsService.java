package com.example.designpattern.lecture_baek._06_adapter._02_after;

import com.example.designpattern.lecture_baek._06_adapter._02_after.security.UserDetails;
import com.example.designpattern.lecture_baek._06_adapter._02_after.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    //사실 왜 어댑터 패턴을 쓰는지 이해가 잘 안갔음. 그냥 새로 클래스 만들지 말고 AccountService에 UserDetailsService상속해서 사용하면 되지 않나? 구지? 이렇게 생각함
    //이경우는 기존의 account, AccountService를 건드리지 못하는 상황에서 다른 것들을 사용해야 하는 경우에 좋다고 한다.
    // 만약 account, AccountService를 사용 가능한 경우는 맨위에서 말한대로 그대로 상속해서 사용하는게 좋다고함.
    // 그래서 조금 이해가 됨. 결국 target과 adeptee 를 건드리지 못하는데 둘을 사용해야 하는 상황에 어뎁터를 만들어 주는 걸로 이해가 되었다.
    // 근데 결국 약간 implements에 대한 이야기를 하는거 같기도 한데 일단은 애매함.
    @Override
    public UserDetails loadUser(String username) {
        Account accountByUsername = accountService.findAccountByUsername(username);
        return new AccountUserDetails(accountByUsername);
    }
}
