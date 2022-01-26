package com.hagere.ethiop.repositories;

import com.hagere.ethiop.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
            public Admin findByUsername(String username);
}
