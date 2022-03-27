package com.hrmsSystem.hrmsSystem.business.abstracts;

import java.rmi.RemoteException;
import java.util.List;

import com.hrmsSystem.hrmsSystem.core.adapters.abstracts.MernisCheckService;
import com.hrmsSystem.hrmsSystem.core.utilities.results.DataResult;
import com.hrmsSystem.hrmsSystem.core.utilities.results.Result;
import com.hrmsSystem.hrmsSystem.entities.concretes.JobSeeker;

public interface JobSeekerService {

	public Result addToSystem(JobSeeker jobSeeker, MernisCheckService mernisCheckService) throws NumberFormatException, RemoteException;
	public DataResult<List<JobSeeker>> getAll();
}
