package com.hagere.ethiop.services;

import com.hagere.ethiop.Entity.User;
import com.hagere.ethiop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
    @Autowired
    private UserRepository personRepository;
    public void save(User user){

        personRepository.save(user);

    }


}
