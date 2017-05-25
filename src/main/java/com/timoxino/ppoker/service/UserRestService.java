package com.timoxino.ppoker.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.Collections;
import java.util.Map;

/**
 * Class represents RESTful service to work with {@link java.security.Principal} entity.
 *
 * @author timoxino.
 */
@RestController
public class UserRestService
{

    @RequestMapping("/user")
    public Principal user(Principal user)
    {
        return user;
    }

    @RequestMapping("/token")
    public Map<String, String> token(HttpSession httpSession)
    {
        return Collections.singletonMap("token", httpSession.getId());
    }

}
