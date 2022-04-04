package com.hrmsSystem.hrmsSystem.api.controllers;


import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.apache.axis.client.Service;
import com.hrmsSystem.hrmsSystem.business.abstracts.JobSeekerService;
import com.hrmsSystem.hrmsSystem.core.adapters.abstracts.MernisCheckService;

import com.hrmsSystem.hrmsSystem.core.utilities.results.DataResult;
import com.hrmsSystem.hrmsSystem.core.utilities.results.Result;
import com.hrmsSystem.hrmsSystem.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekerController {
	private JobSeekerService jobSeekerService;

	@Autowired
	public JobSeekerController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}


	

	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getAll(){
		return jobSeekerService.getAll();
		
	}
	
	@ResponseBody
	@PostMapping("/add")
	public Result add(@RequestBody JobSeeker jobSeeker ) throws RemoteException  {
		return this.jobSeekerService.addToSystem(jobSeeker );
	}
}
