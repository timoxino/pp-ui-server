package com.timoxino.ppoker.service;

import com.timoxino.ppoker.dao.AccountRepository;
import com.timoxino.ppoker.exception.UserNotFoundException;
import com.timoxino.ppoker.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Class represents RESTful service to work with {@link Account} entity.
 *
 * @author timoxino.
 */
@RestController
@RequestMapping("/account")
public class AccountRestService
{
    private final AccountRepository accountRepository;

    @Autowired
    public AccountRestService(AccountRepository accountRepository)
    {
        this.accountRepository = accountRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    Account readAccount(@RequestParam("email") String email)
    {
        return accountRepository.findByEmail(email).orElseThrow(() -> new UserNotFoundException(email));
    }

    @RequestMapping(value = "/signIn", method = RequestMethod.POST)
    Account signIn(@RequestBody Account account)
    {
        String email = account.getEmail();
        return accountRepository.findByEmail(email).orElseThrow(() -> new UserNotFoundException(email));
    }
}
