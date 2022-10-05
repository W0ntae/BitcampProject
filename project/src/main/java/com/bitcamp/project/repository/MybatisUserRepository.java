package com.bitcamp.project.repository;

import com.bitcamp.project.domain.User;
import com.bitcamp.project.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MybatisUserRepository implements UserRepository{
  
  private final UserMapper userMapper;
  
  @Override
  public List<User> findAll() {
    return userMapper.findUsers();
  }
  
}
