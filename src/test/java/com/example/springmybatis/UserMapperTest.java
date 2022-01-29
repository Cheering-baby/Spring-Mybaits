package com.example.springmybatis;

import com.example.springmybatis.entity.User;
import com.example.springmybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void QueryUser() {
       User user = userMapper.Sel(18);
       assertNotNull(user);
    }

    @Test
    public void InsertUser() {
        User newUser = new User();
        newUser.setUsername("test");
        newUser.setPassword("test");
        newUser.setRoleCode("ADMIN");
        int result = userMapper.addUser(newUser);
        assertEquals(result, 1);
    }
}
