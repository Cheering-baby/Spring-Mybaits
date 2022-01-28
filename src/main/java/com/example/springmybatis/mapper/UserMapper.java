package com.example.springmybatis.mapper;

import com.example.springmybatis.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User Sel(int id);
}
