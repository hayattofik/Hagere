package com.hagere.ethiop.repositories;

import com.hagere.ethiop.Entity.governmentOffice;
import org.springframework.data.repository.CrudRepository;


public interface governmentOfficeRepository extends CrudRepository<governmentOffice, Integer> {
    public  governmentOffice findByUsername(String username);
}
