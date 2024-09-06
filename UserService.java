package com.VMOproject.fresher.service;

import com.VMOproject.fresher.dto.request.UserUpdateRequest;
import com.VMOproject.fresher.entity.User;
import com.VMOproject.fresher.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(UserRepository request) {
        User user = new User();

        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());

        return userRepository.save(user);

    }
    public User getUser(String userId) {
        return null;
    }

    public List<User> getUsers() {
        return null;
    }

    public User updateUser(String userId, UserUpdateRequest request) {
        return null;
    }

    public void deleteUser(String userId) {
    }

}
