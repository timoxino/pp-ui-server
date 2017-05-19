package com.timoxino.ppoker.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Class represents an exception which signals that user hasn't been found by email provided.
 *
 * @author timoxino.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException
{
    public UserNotFoundException(String email)
    {
        super("Could not find user with email '" + email + "'.");
    }
}
