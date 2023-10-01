package com.Anish.Ecommerce.API.Creation.service;

import com.Anish.Ecommerce.API.Creation.model.User;
import com.Anish.Ecommerce.API.Creation.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public User createUser(User user) {
        return userRepo.save(user);
    }
}
