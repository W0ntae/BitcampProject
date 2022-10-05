package com.bitcamp.project.service;

import com.bitcamp.project.domain.User;
import com.bitcamp.project.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService1 implements UserService {
  
  private final UserRepository userRepository;
  private User user;
  
  @Override
  public List<User> findAll() {
    return userRepository.findAll();
  }
}
