package net.abadguy.bsimpleconsumermovie.controller;

import net.abadguy.bsimpleconsumermovie.UserFeignClient;
import net.abadguy.bsimpleconsumermovie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {
    @Autowired
    private UserFeignClient userFeignClient;


    @GetMapping("/movie/{id}")
    public User findById(@PathVariable int id){
        return userFeignClient.findById(id);
    }
}
