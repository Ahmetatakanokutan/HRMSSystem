package com.hrmsSystem.hrmsSystem.business.concretes;

import org.springframework.stereotype.Service;

import com.hrmsSystem.hrmsSystem.business.abstracts.SystemPersonelService;
import com.hrmsSystem.hrmsSystem.core.utilities.results.Result;
import com.hrmsSystem.hrmsSystem.core.utilities.results.SuccessResult;



@Service
public class SystemPersonelManager implements SystemPersonelService{
	
	public Result verification() {
		return new SuccessResult();
	}

}
