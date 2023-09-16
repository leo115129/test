package com.example.springboot_ssmp.controller.utils;

import lombok.Data;

@Data
public class R {
    private boolean flag;
    private Object object;
    public R(){}
    public R(boolean flag){
        this.flag=flag;
    }
    public R(boolean flag,Object object){
        this.flag=flag;
        this.object=object;
    }
}
