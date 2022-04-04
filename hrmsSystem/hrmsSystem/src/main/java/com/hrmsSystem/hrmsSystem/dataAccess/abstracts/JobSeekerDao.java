package com.hrmsSystem.hrmsSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrmsSystem.hrmsSystem.entities.abstracts.User;
import com.hrmsSystem.hrmsSystem.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer>{
User findByeMail(String eMail);
User findBytcNo(long tcNo);

}
	