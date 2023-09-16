package com.example.springboot_ssmp;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot_ssmp.dao.AccountDao;
import com.example.springboot_ssmp.domin.Account;
import com.example.springboot_ssmp.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootSsmpApplicationTests {

    @Autowired
    private AccountService accountService;

    @Test
    void contextLoads() {
        System.out.println(accountService.getById(1));
    }

}
