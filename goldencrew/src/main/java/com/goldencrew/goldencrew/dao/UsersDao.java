package com.goldencrew.goldencrew.dao;

import com.goldencrew.goldencrew.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersDao extends JpaRepository<Users,Long> {
    Users findByUsername(String username);
}
