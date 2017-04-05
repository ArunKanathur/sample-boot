package com.arun.sampleboot.controller;

import com.arun.sampleboot.domain.User;
import com.arun.sampleboot.service.UserService;

import java.util.List;
import java.util.concurrent.Callable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createUser(@RequestBody User user) {

        log.info("UserController.createUser()");
        userService.createUser(user);
    }

    @RequestMapping(value = "/user/{userid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Callable<User> getUser(@PathVariable(value = "userid") String userId) {

        log.info("UserController.getUser()");
        return () -> userService.getUser(userId);
    }

    @RequestMapping(value = "/user/{userid}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateUser(@RequestBody User user, @PathVariable(value = "userid") String userId) {

        log.info("UserController.updateUser()");
        userService.updateUser(user, userId);
    }

    @RequestMapping(value = "/user/{userid}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable(value = "userid") String userId) {

        log.info("UserController.deleteUser()");
        userService.deleteUser(userId);
    }

    @RequestMapping(value = "/user/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Callable<List<User>> getUserList() {

        log.info("UserController.getUser()");
        return () -> userService.getUserList();
    }

}
