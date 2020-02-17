package com.project.omega.service;

import com.project.omega.exceptions.DuplicateUserException;
import com.project.omega.bean.User;

import java.util.List;

public interface UserService {

    void createUser(User user) throws DuplicateUserException;

    List<User> getAllUsers();

    User getUserById(String id);

    boolean deleteUserById(String id);

    boolean updateUser(User user);
}
