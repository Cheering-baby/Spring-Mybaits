package com.example.springmybatis.mapper;

import com.example.springmybatis.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    // query
    User Sel(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(Integer id);

    List<User> getUserLikeByName(String name);
}
