package com.ebm.users.service;

import com.ebm.users.web.model.User;
import com.ebm.users.web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        if (user.getAge() < 18) {
            throw new IllegalArgumentException("L'utilisateur doit avoir au moins 18 ans.");
        } else if (user.getDriveLicenseNumber() == null) {
            throw new IllegalArgumentException("L'utilisateur doit avoir un numéro de permis valide");
        }

        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}
