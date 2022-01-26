package com.hagere.ethiop.repositories;
import com.hagere.ethiop.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
     public User findByUsername(String username);
}
