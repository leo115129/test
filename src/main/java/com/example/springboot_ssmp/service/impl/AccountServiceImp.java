package com.example.springboot_ssmp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot_ssmp.dao.AccountDao;
import com.example.springboot_ssmp.domin.Account;
import com.example.springboot_ssmp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImp extends ServiceImpl<AccountDao, Account> implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public boolean save(Account account) {
        return accountDao.insert(account)>0;
    }

    @Override
    public boolean update(Account account) {
        return accountDao.updateById(account)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return  accountDao.deleteById(id)>0;
    }


}
