package com.example.demo.plantDic.security.model;

import com.example.demo.plantDic.entity.Account;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class CustomUserDetails extends User {
    private Account account;

    public CustomUserDetails(Account account, List<GrantedAuthority> roles) {
        super(account.getUserId(), account.getPassword(), roles);
        this.account = account;
    }
}
