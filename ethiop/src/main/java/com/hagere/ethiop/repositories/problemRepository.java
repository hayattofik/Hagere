package com.hagere.ethiop.repositories;

import com.hagere.ethiop.Entity.User;
import com.hagere.ethiop.Entity.problem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface problemRepository extends JpaRepository<problem, Integer> {
    public User findByOrganization(String organization);
}

