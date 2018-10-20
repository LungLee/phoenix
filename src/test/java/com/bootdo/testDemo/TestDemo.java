package com.bootdo.testDemo;

import com.bootdo.entity.Login;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDemo {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    private Login login;
    @Test
    public void test() {
        redisTemplate.opsForValue().set("a", "b");
        System.out.println(redisTemplate.opsForValue().get("a"));
    }

    @Test
    public void contextLoads() {
        System.out.println("Hello:"+login);
    }
    ;
}
