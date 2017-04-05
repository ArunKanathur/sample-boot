package com.arun.sampleboot.dao;

import com.arun.sampleboot.domain.User;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class UserDaoImpl implements UserDao {

    @Override
    public void createUser(User user) {

        // create user
    }

    @Override
    public User getUser(String userId) {

        String password = "password";

        log.info("UserDaoImpl.getUser()");
        User user = new User();
        user.setPassword(password);
        user.setUsername("arun");

        return user;
    }

    @Override
    public void updateUser(User user, String userId) {
        // update user
    }

    @Override
    public void deleteUser(String userId) {
        // delete user
    }

    @Override
    public List<User> getUserList() {
        return new ArrayList<User>() {
            private static final long serialVersionUID = 1L;
            {
                add(getUser(null));
            }
        };
    }

}
