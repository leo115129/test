package com.example.springboot_ssmp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot_ssmp.domin.Account;


public interface AccountService extends IService<Account> {
    @Override
    boolean save(Account account);

    boolean update(Account account);

    boolean delete(Integer id);
}
