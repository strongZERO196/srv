package com.example.spring_project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t1")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long a;
  private String b;

  protected User() {}

  public User(String b) {
    this.b = b;
  }

  public Long getA() {
    return a;
  }

  public String getB() {
    return b;
  }

  @Override
  public String toString() {
    return String.format("{a:%d,b:%s}", a, b);
  }
}
