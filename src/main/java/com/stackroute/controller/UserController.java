package com.stackroute.controller;

import com.stackroute.domain.User;
import com.stackroute.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public ResponseEntity<?> saveNewUser(@RequestBody User user) {
        ResponseEntity responseEntity;
        userService.saveNewUser(user);
        responseEntity = new ResponseEntity<String>("Successfully Created", HttpStatus.CREATED);
        return responseEntity;
    }

    @GetMapping("/users")
    public ResponseEntity<?> getAllUsers() {
        ResponseEntity responseEntity;
        responseEntity = new ResponseEntity<List<User>>((List<User>) userService.getAllUsers(), HttpStatus.FOUND);
        return responseEntity;
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") int id){
        ResponseEntity responseEntity;
        responseEntity=new ResponseEntity<>(userService.findById(id),HttpStatus.FOUND);
        return responseEntity;
    }
}
