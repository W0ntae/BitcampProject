package com.bitcamp.project.repository;

import com.bitcamp.project.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {
  List<User> findAll();
  
  void deleteUser();
}
