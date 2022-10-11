package com.bitcamp.project.mapper;

import com.bitcamp.project.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
  List<User> findUsers();
  
  void deleteUser(@Param("id")int id);
}
