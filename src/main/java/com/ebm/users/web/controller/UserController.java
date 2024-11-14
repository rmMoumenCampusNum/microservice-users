package com.ebm.users.web.controller;

import com.ebm.users.service.UserService;
import com.ebm.users.web.model.User;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Operation(summary = "Récupérer tous les users", description = "Retourne tous les users")
    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> user = userService.getAllUsers();
        return ResponseEntity.ok(user);
    }

    @Operation(summary = "Récupérer un user", description = "Retourne un user par son ID")
    @GetMapping("/users/{id}")
    public ResponseEntity<Optional<User>> getUserById(@PathVariable long id) {
        Optional<User> user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @Operation(summary = "Créer un user", description = "Crée un user")
    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User userCreated = userService.createUser(user);
        return ResponseEntity.ok(userCreated);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return ResponseEntity.ok(userService.updateUser(user));
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }


}
