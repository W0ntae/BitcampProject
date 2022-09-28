package com.bitcamp.project.domain;

import lombok.Data;

@Data
public class User {
  int UserId;
  String Username;
  String Email;
  String Password;
  String Intro;
  
  public User(){
  }
  
  public User(String Username, String Email, String Password){
    this.Username = Username;
    this.Email = Email;
    this.Password = Password;
  }
  
  public User(int UserId, String Username, String Password){
    this.UserId = UserId;
    this.Username = Username;
    this.Password = Password;
  }
}
