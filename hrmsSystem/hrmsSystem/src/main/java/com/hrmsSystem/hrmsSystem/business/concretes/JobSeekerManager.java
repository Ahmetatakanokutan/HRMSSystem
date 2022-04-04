package com.hrmsSystem.hrmsSystem.business.concretes;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrmsSystem.hrmsSystem.business.abstracts.JobSeekerService;
import com.hrmsSystem.hrmsSystem.core.adapters.abstracts.MernisCheckService;
import com.hrmsSystem.hrmsSystem.core.adapters.concretes.MernisCheckManager;
import com.hrmsSystem.hrmsSystem.core.utilities.results.DataResult;
import com.hrmsSystem.hrmsSystem.core.utilities.results.ErrorResult;
import com.hrmsSystem.hrmsSystem.core.utilities.results.Result;
import com.hrmsSystem.hrmsSystem.core.utilities.results.SuccessDataResult;
import com.hrmsSystem.hrmsSystem.core.utilities.results.SuccessResult;
import com.hrmsSystem.hrmsSystem.dataAccess.abstracts.JobSeekerDao;
import com.hrmsSystem.hrmsSystem.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{

	JobSeekerDao jobSeekerDao;

	private MernisCheckManager mernisCheckService = new MernisCheckManager();
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao ) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		
				
		                                                                                                         
	}

	
			
	@Override
	public Result addToSystem(JobSeeker jobSeeker) throws NumberFormatException, RemoteException{
		
		if(mernisCheckService.check(jobSeeker).isSuccess()) {
			return new ErrorResult("girdiginiz bilgiler uygun degildir");
		}
		if( jobSeekerDao.findByeMail(jobSeeker.getEMail()) == null && jobSeekerDao.findBytcNo(jobSeeker.getTcNo()) == null){
			jobSeekerDao.save(jobSeeker);
			return new SuccessResult("kisinin kimlik kontrolu database ile eslenmistir ve daha once kayitli degildir");
			
		}
		else {
			return new ErrorResult("girdiginiz bilgiler uygun degildir");
		}
		}

	
	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(jobSeekerDao.findAll(), "urun basarili bir sekilde eklendi");
	}




	
}
