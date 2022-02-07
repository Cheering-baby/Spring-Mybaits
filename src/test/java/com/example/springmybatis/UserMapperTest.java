package com.example.springmybatis;

import com.example.springmybatis.entity.User;
import com.example.springmybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

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

    @Test
    public void UpdateUser() {
        User newUser = new User();
        newUser.setUsername("test_1");
        newUser.setPassword("test_1");
        newUser.setRoleCode("ADMIN_1");
        newUser.setId(35);
        int result = userMapper.updateUser(newUser);
        assertEquals(result, 1);
    }

    @Test
    public void DeleteUser() {
        int result = userMapper.deleteUser(33);
        assertEquals(result, 1);
    }

    @Test
    public void GetUserLikeByName() {
        List<User> result = userMapper.getUserLikeByName("admin");
        Assert.notEmpty(result);
    }
}
