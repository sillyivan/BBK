package com.example.demo;


import com.google.common.base.Objects;
import com.google.common.collect.*;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.time.Clock;
import java.util.*;

@SpringBootApplication
public class DemoApplication {

    public static Map<String,Object> map1= Maps.newHashMap();

    public static void main(String[] args) throws ScriptException {
        SpringApplication.run(DemoApplication.class, args);

    }


}
