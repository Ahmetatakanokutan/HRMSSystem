package com.hrmsSystem.hrmsSystem.business.abstracts;


import java.rmi.RemoteException;
import java.util.List;

import com.hrmsSystem.hrmsSystem.core.utilities.results.DataResult;
import com.hrmsSystem.hrmsSystem.core.utilities.results.Result;
import com.hrmsSystem.hrmsSystem.entities.concretes.JobSeeker;

public interface JobSeekerService {

	public DataResult<List<JobSeeker>> getAll();
	public Result addToSystem(JobSeeker jobSeeker) throws NumberFormatException, RemoteException;
}
