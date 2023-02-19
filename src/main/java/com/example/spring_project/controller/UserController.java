package com.example.spring_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_project.repository.UserRepository;


@RestController
@CrossOrigin(origins = {"http://localhost:9000"})
public class UserController {

  private final UserRepository repository;

  @Autowired
  public UserController(UserRepository repository) {
    this.repository = repository;
  }

  @RequestMapping("/test")
  public String user() {
    return String.valueOf(repository.findAll());
  }
}