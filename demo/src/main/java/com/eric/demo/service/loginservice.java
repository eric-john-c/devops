package com.eric.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eric.demo.domain.login;
import com.eric.demo.reposiory.loginrepo;

@Service
public class loginservice {
    @Autowired
    private loginrepo repo;

    public login log(String username, String password) {
        login user = repo.findByUsernameAndPassword(username, password);
        return user;
    }
}