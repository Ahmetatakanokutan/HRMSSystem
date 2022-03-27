package com.hrmsSystem.hrmsSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrmsSystem.hrmsSystem.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer>{
boolean findByeMail(String eMail);
boolean findBytcNo(long tcNo);

}
	