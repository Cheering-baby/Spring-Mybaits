package com.example.springmybatis.mapper;

import com.example.springmybatis.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User Sel(int id);

    int addUser(User user);
}
