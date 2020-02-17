package com.project.omega.service;

import com.project.omega.exceptions.DuplicateUserException;
import com.project.omega.bean.User;
import com.project.omega.helper.Constant;
import com.project.omega.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    public void createUser(User user) throws DuplicateUserException {
        String email = user.getEmail();
        if(userRepository.findByEmail(email) == 0) {
            userRepository.save(user);
        } else {
            throw new DuplicateUserException(Constant.ERROR_USER_EXISTS + email);
        }
    }

    public List<User> getAllUsers() {
        return (List) userRepository.findAll();
    }

    public User getUserById(String id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()) {
            return user.get();
        }
        return null;
    }

    public boolean deleteUserById(String id) {
        if(userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public boolean updateUser(User user) {
        if(userRepository.existsById(user.getId())) {
            userRepository.save(user);
            return true;
        }
        return false;
    }
}
