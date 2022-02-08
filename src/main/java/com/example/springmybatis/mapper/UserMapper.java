package com.example.springmybatis.mapper;

import com.example.springmybatis.entity.User;
import org.apache.ibatis.annotations.*;
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

    @Select("select id, username, password, role_code as roleCode from z_user where role_code=#{role}")
    List<User> getUserLikeByRole(String role);
}
