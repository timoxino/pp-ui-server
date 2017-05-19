package com.timoxino.ppoker.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Class represents RESTful service to work with {@link java.security.Principal} entity.
 *
 * @author timoxino.
 */
@RestController
public class UserRestService {

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
