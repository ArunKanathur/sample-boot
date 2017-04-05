package com.arun.sampleboot.service;

import com.arun.sampleboot.dao.UserDao;
import com.arun.sampleboot.domain.User;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    @Getter
    @Setter
    private UserDao userDao;

    public void createUser(User user) {
        log.info("UserServiceImpl.createUser()");
        userDao.createUser(user);
    }

    public User getUser(String userId) {
        log.info("UserServiceImpl.getUser()");
        return userDao.getUser(userId);
    }

    public void updateUser(User user, String userId) {
        log.info("UserServiceImpl.updateUser()");
    }

    public void deleteUser(String userId) {
        log.info("UserServiceImpl.deleteUser()");
    }

    public List<User> getUserList() {
        log.info("UserServiceImpl.getUserList()");
        return userDao.getUserList();
    }

}
