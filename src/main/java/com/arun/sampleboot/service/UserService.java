package com.arun.sampleboot.service;

import com.arun.sampleboot.domain.User;

import java.util.List;

public interface UserService {

    void createUser(User user);

    User getUser(String userId);

    void updateUser(User user, String userId);

    void deleteUser(String userId);

    List<User> getUserList();
}
