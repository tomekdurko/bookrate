package com.webapp.bookrate.Controller;



import com.webapp.bookrate.Entity.User;
import com.webapp.bookrate.Services.UserServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserServices userServices;

    public UserController(UserServices userServices)
    {
        this.userServices = userServices;
    }

    @GetMapping
    @RequestMapping("/{userId}")
    public Optional<User> getUserById(@PathVariable long userId)
    {
        return userServices.getUser(userId);
    }

    @GetMapping
    @RequestMapping("/{name}")
    public Optional<User> getUserByName(@PathVariable String name)
    {
        return userServices.getUserByName(name);
    }

    @PostMapping
    public User postUser(@RequestBody User user)
    {
        return userServices.addUser(user);
    }

    @GetMapping
    public List<User> getUsers()
    {
        return userServices.getUsers();
    }


}
