package com.hagere.ethiop.services;

import com.hagere.ethiop.Entity.governmentOffice;
import com.hagere.ethiop.repositories.governmentOfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class governmentOfficeService {
    @Autowired
    private governmentOfficeRepository govRepo;
    public void save(governmentOffice govOffice){

      govRepo.save(govOffice);
    }

}

