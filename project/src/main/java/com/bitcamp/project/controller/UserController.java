package com.bitcamp.project.controller;

import com.bitcamp.project.domain.User;
import com.bitcamp.project.service.UserService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@Data
public class UserController {
  
  private final UserService userService;
  
  @GetMapping("/viewUsers")
  public String ViewUsers(Model model){
    List<User> users = userService.findAll();
    model.addAttribute("users", users);
    return "User/AdminUser";
  }
  
  @PostMapping("/viewUsers")
  public String deletedUser(Model model, HttpServletRequest request, HttpServletResponse response){
    
    return "User/AdminUser";
  }
}
