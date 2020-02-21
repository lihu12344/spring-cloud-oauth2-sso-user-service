package com.example.demo.controller;

import com.example.demo.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping("/get")
    public List<User> getAll(){
        List<User> list=new ArrayList<>();

        for (int i=0;i<10;i++){
            User user=new User();
            user.setAge(20+i%5);
            user.setName("瓜田李下"+i);

            list.add(user);
        }

        return list;
    }
}
