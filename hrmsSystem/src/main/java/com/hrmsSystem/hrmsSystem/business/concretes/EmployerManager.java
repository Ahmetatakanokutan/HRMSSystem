package com.hrmsSystem.hrmsSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrmsSystem.hrmsSystem.business.abstracts.EmployerService;
import com.hrmsSystem.hrmsSystem.business.abstracts.SystemPersonelService;
import com.hrmsSystem.hrmsSystem.core.utilities.results.DataResult;
import com.hrmsSystem.hrmsSystem.core.utilities.results.ErrorResult;
import com.hrmsSystem.hrmsSystem.core.utilities.results.Result;
import com.hrmsSystem.hrmsSystem.core.utilities.results.SuccessDataResult;
import com.hrmsSystem.hrmsSystem.core.utilities.results.SuccessResult;
import com.hrmsSystem.hrmsSystem.dataAccess.abstracts.EmployerDao;
import com.hrmsSystem.hrmsSystem.entities.concretes.Employer;
import com.hrmsSystem.hrmsSystem.entities.concretes.SystemPersonel;

@Service
public class EmployerManager implements EmployerService{

	EmployerDao employerDao;
	SystemPersonelService systemPersonelService;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao , SystemPersonelService systemPersonelService) {
		super();
		this.employerDao = employerDao;
		this.systemPersonelService = systemPersonelService;
	}


	public Result addToSystem(Employer employer) {
		if(!employerDao.findByeMail(employer.getEMail()) && systemPersonelService.verification().isSuccess()){
		employerDao.save(employer);
		return new SuccessResult("sisteme basarili bir sekilde eklendi");
		}
		
		else {
			return new ErrorResult("gereksinimler saglanamadigi icin sisteme eklenemedi");
		}
		
	}
	
	public DataResult<List<Employer>> getAll(){
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll()
				, "urunun datasi basarili bir sekilde disariya aktarilmistir");
	}

}
