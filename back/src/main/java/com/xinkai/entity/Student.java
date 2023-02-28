package com.xinkai.entity;

import lombok.Data;
// 生成构造，get,set,tostring方法
@Data
public class Student {
    private long id;
    private String number;
    private String name;
    private int age;
    private int chinese;
    private int math;
    private int english;
}
