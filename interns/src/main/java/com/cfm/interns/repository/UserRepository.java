package com.cfm.interns.repository;

import com.cfm.interns.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}