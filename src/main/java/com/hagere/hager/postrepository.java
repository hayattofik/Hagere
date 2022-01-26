package com.hagere.hager;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface postrepository extends CrudRepository<post, Long> {
}