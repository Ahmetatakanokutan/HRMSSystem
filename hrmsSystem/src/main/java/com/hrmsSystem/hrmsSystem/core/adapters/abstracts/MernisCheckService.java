package com.hrmsSystem.hrmsSystem.core.adapters.abstracts;

import java.rmi.RemoteException;

import com.hrmsSystem.hrmsSystem.business.abstracts.JobSeekerService;
import com.hrmsSystem.hrmsSystem.entities.concretes.JobSeeker;

public interface MernisCheckService  {
	boolean check(JobSeeker jobSeeker)throws NumberFormatException, RemoteException;
}
