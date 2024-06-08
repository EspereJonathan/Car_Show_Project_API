package com.espere.car.controller;


import com.espere.car.entity.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Getter
@Setter
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        return userService.getpublic ;
    }

    @PostMapping
    public User createUser() {
        return userService.saveUser();
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return userService.saveUser();
    }

    @DeleteMapping("/{id}")
    public void deleteUser() {
        userService.deleteUser();
    }

    public static class UserService {
        public User getpublic;

        public List<User> getAllUsers() {
            return List.of();
        }
        public void deleteUser() {
        }

        public User saveUser() {
            return null;
        }

        public User getUserById() {
            return null;
        }
    }
}
