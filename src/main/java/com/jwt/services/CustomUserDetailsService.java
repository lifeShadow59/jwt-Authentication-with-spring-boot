package com.jwt.services;

import com.jwt.model.JwtRequest;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username.equals("abhishek")) {
            return new User("abhishek", "Dhanani", new ArrayList<>());
        }
        throw new UsernameNotFoundException("User not found");
    }

    public ArrayList<JwtRequest> getAllUsersList(){
        final ArrayList<JwtRequest> usersList = new ArrayList<JwtRequest>();
        usersList.add(new  JwtRequest("abhishek", "dhanani"));
        return usersList;
    }
}
