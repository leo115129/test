package com.example.springboot_ssmp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot_ssmp.domin.Account;
import org.apache.ibatis.annotations.Mapper;

import java.awt.print.Book;

@Mapper
public interface AccountDao extends BaseMapper<Account> {

}
