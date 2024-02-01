package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.UserRepository;
import com.example.demo.entites.User;
@Service
public class UserService {
   @Autowired
    private UserRepository userRepository;

   public User addUser(User u)
   {
       return userRepository.save(u);
   }

}
