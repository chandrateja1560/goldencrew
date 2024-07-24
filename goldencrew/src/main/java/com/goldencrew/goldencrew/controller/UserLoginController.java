package com.goldencrew.goldencrew.controller;

import com.goldencrew.goldencrew.model.Users;
import com.goldencrew.goldencrew.service.UsersListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/login")
public class UserLoginController {

    @Autowired
    UsersListService usersListService;

    @PostMapping
    public ResponseEntity<String> loginUser(@RequestBody Users user) {
        Users foundUser = usersListService.getUserByUsername(user.getUsername());
        if (foundUser != null) {
            // User exists in the database, now check the password
            if (foundUser.getPassword().equals(user.getPassword())) {
                return ResponseEntity.ok("Login successful");
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Incorrect password");
            }
        } else {
            // User not found in the database
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User not found");
        }
    }

    @GetMapping("/getusers")
    public ResponseEntity<List<Users>> getAllUsers(){
       List<Users> l=usersListService.getAllUsers();
       return ResponseEntity.ok().body(l);
    }
}
