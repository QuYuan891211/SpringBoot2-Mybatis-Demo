package com.qy.controller;

import com.qy.model.UserDomain;
import com.qy.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/add")
    public int addUser(UserDomain userDomain){
        return userService.addUser(userDomain);
    }

    @ResponseBody
    @GetMapping("/all")
    public Object findAllUser(@RequestParam(name = "pageNum", required = false, defaultValue = "1")
                                          int pageNum,
                              @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                                          int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }
}
