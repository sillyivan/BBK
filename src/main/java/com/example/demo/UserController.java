package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/{id}")
    public String  getUser(@PathVariable Integer id, Model model) {

        User user = new User();
        user.id=id;
        user.address="广州18589205569";
        user.address="广州18620230235";
        user.age="18";
        user.name="ivan";

        model.addAttribute("user",user);
        return "/user/detail";
    }

    @RequestMapping("/{path}/list")
    public String  listUser(Model model ,@PathVariable("path") String pad) {
        List<User> userList = new ArrayList<User>();
        for (int i = 0; i <10; i++) {
            User user = new User();
            user.id=i;
            user.address="广州";
            user.age="18";
            user.name="ivan"+i;
            userList.add(user);
        }

        System.out.print(pad);

        model.addAttribute("users", userList);
        return "/user/list";
    }

}
