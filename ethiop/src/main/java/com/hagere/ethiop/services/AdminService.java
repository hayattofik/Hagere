package com.hagere.ethiop.services;

import com.hagere.ethiop.Entity.Admin;
import com.hagere.ethiop.Entity.governmentOffice;
import com.hagere.ethiop.repositories.AdminRepository;
import com.hagere.ethiop.repositories.governmentOfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepo;
    public void save(Admin admin){
//
        adminRepo.save(admin);
    }
    @PreAuthorize("hasRole(@roles.ADMIN)")
    public boolean ensureAdmin() {
        return true;
    }

}
