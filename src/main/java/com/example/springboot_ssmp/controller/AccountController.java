package com.example.springboot_ssmp.controller;

import com.example.springboot_ssmp.controller.utils.R;
import com.example.springboot_ssmp.domin.Account;
import com.example.springboot_ssmp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public R save(@RequestBody Account account){
        return new R(accountService.save((account)));
    }

    @PutMapping
    public R update(@RequestBody Account account){
        return new R(accountService.update(account));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(accountService.delete(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        return new R(true,accountService.getById(id));
    }

    @GetMapping
    public R getAll(){
        return new R(true,accountService.list());
    }
}
