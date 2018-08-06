package net.abadguy.bsimpleconsumermovie.controller;

import net.abadguy.bsimpleconsumermovie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable int id){
        return this.restTemplate.getForObject("http://localhost:8080/findById?id="+id,User.class);
    }
}
