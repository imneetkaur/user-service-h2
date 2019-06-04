package com.stackroute.service;

import com.stackroute.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public User saveNewUser(User user);
    public List<User> getAllUsers();
    public List<User>  findByName();

}
