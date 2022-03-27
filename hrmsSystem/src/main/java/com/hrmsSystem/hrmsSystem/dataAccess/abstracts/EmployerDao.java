package com.hrmsSystem.hrmsSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrmsSystem.hrmsSystem.entities.concretes.Employer;
import com.hrmsSystem.hrmsSystem.entities.concretes.JobSeeker;

public interface EmployerDao extends JpaRepository<Employer, Integer>{
boolean findByeMail(String eMail);
}
