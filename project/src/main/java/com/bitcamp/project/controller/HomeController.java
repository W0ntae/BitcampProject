package com.bitcamp.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {
  @GetMapping("/")
  public String home(Model model, HttpServletRequest request, HttpServletResponse response){
    model.addAttribute("user", request.getAttribute("user"));
    return "Home";
  }
}
