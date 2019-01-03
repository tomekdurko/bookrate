package com.webapp.bookrate.Services;

import com.webapp.bookrate.Entity.User;
import com.webapp.bookrate.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    private UserRepository userRepository;

    public UserServices(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public Optional<User> getUser(long id)
    {
        return userRepository.findById(id);
    }

    public User addUser(User input)
    {
        return userRepository.save(input);
    }

    public Optional<User> getUserByName(String name)
    {
        return userRepository.findByName(name);
    }

    public List<User> getUsers()
    {
        return userRepository.findAll();
    }
}
