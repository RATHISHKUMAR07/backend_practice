package com.login.user.service;


import com.login.user.model.User;
import com.login.user.repository.UserRepository;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordService passwordService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@Valid @RequestBody User user) {
        // Encrypt the password before saving the user
        String email = user.getEmail();
        User temp = findByEmail(email);

        if (temp != null) {
            return new ResponseEntity<>("User with email id already registered", HttpStatus.CONFLICT);
        }

        user.setPassword(passwordService.encryptPassword(user.getPassword()));
        userRepository.save(user);

        String res = "Registered\n" + email + "\n" + user.getName() + "\n" + user.getPassword();
        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public String loginUser(String email, String password) {
        User userOpt = findByEmail(email);
        if (userOpt != null) {
            if (passwordService.matchPassword(password, userOpt.getPassword())) {
                return "Login successful" + '\n' + userOpt.getEmail();
            }
        }
        if(userOpt != null && userOpt.getEmail().equals(email) && !passwordService.matchPassword(password, userOpt.getPassword()))
            return "Invalid Password";
        if(userOpt == null)
            return "Invalid email";
        return "Invalid";
    }

    @Autowired
    MongoClient mongoClient;
    @Autowired
    MongoConverter mongoConverter;
    @Override
    public User findByEmail(String email) {
        MongoDatabase database = mongoClient.getDatabase("login");
        MongoCollection<Document> collection = database.getCollection("User");

        Document query = new Document("email", email);
        Document result = collection.find(query).first();

        if (result != null) {
            return mongoConverter.read(User.class, result);
        }
        return null;
    }
}
