package com.example.spring_project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.spring_project.entity.User;

@Service
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}