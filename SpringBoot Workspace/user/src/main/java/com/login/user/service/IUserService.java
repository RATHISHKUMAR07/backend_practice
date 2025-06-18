package com.login.user.service;

import com.login.user.model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IUserService {
    ResponseEntity<String> registerUser(User user);
    List<User> getAllUsers();
    String loginUser(String email, String password);
    User findByEmail(String email);
}
