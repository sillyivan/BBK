package com.example.demo;

import lombok.Data;

@Data
public class Person {

    private Integer  id;

    private String name;

    private String sex;

    private Integer age;

    public Person(Integer i, String nam, String se, Integer ag) {
        id=i;
        name=nam;
        sex=se;
        age=ag;

    }


    //提供get，set，和满参构造函数
}
