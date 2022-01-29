package com.example.springmybatis;

import com.example.springmybatis.entity.User;
import com.example.springmybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringMybatisApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    public void QueryUser() {
        User user = userMapper.Sel(18);
    }

    @Test
    void contextLoads() {
    }


}
