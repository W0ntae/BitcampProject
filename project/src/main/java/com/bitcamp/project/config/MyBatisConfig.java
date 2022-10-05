package com.bitcamp.project.config;

import com.bitcamp.project.mapper.UserMapper;
import com.bitcamp.project.repository.MybatisUserRepository;
import com.bitcamp.project.repository.UserRepository;
import com.bitcamp.project.service.UserService;
import com.bitcamp.project.service.UserService1;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MyBatisConfig {
  private final UserMapper userMapper;
  
  @Bean
  public UserService userService(){
    return new UserService1(userRepository());
  }
  
  @Bean
  public UserRepository userRepository(){
    return new MybatisUserRepository(userMapper);
  }
}
