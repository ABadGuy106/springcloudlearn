package net.abadguy.asimpleprovideruser.controller;

import net.abadguy.asimpleprovideruser.entity.User;
import net.abadguy.asimpleprovideruser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/findById",method = RequestMethod.GET)
    public User findById(int id){
       return userService.queryUserById(id);

    }
}
