package com.hrmsSystem.hrmsSystem.core.adapters.abstracts;

import java.rmi.RemoteException;

import com.hrmsSystem.hrmsSystem.core.utilities.results.Result;
import com.hrmsSystem.hrmsSystem.entities.concretes.JobSeeker;

public interface MernisCheckService  {
	public Result  check(JobSeeker jobSeeker) throws NumberFormatException, RemoteException;
}
