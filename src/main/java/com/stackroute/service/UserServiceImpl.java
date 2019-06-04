package com.stackroute.service;


import com.stackroute.domain.User;
import com.stackroute.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional<User> findById(int id) {
        return userRepository.findById(id);
    }


    /*
   @Override
    public List<User> findById(User user) {
     return userRepository.findById(user.getId());
    }*/

    /* public List<User> deleteById(Integer id){
       return userRepository.deleteById(id);

    }*/
}
