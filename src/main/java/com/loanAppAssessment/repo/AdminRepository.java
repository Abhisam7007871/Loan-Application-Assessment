package com.loanAppAssessment.repo;

import com.loanAppAssessment.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
     Admin findByEmailOrContact(String email, String contact) ;

     Admin findByContact(String contact);
}
