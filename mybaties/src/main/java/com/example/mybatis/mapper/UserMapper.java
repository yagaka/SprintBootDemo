package com.example.mybatis.mapper;

import com.example.mybatis.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User Sel(int id);
}
