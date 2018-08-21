package net.abadguy.bsimpleconsumermovie;

import net.abadguy.bsimpleconsumermovie.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("c-provider-user")
public interface UserFeignClient {



    @RequestMapping(value = "/findById?", method = RequestMethod.GET)
    public User findById(@PathVariable("id") int id); // 两个坑：1. @GetMapping不支持   2. @PathVariable得设置value
}
