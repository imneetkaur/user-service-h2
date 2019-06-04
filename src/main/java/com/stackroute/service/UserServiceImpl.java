package com.stackroute.service;


import com.stackroute.domain.User;
import com.stackroute.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService{

    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User saveNewUser(User user) {
        User saveNewUser = userRepository.save(user);
        return saveNewUser;
    }
    @Override
    public List<User> getAllUsers() {
       return (List<User>) userRepository.findAll();
    }
    @Override
    public List<User> findByName() {
     return null;
    }

    /* public List<User> deleteById(Integer id){
       return userRepository.deleteById(id);

    }*/
}
