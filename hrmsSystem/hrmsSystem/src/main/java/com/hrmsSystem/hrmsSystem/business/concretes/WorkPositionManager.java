package com.hrmsSystem.hrmsSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrmsSystem.hrmsSystem.business.abstracts.PositionService;
import com.hrmsSystem.hrmsSystem.core.utilities.results.DataResult;
import com.hrmsSystem.hrmsSystem.core.utilities.results.ErrorResult;
import com.hrmsSystem.hrmsSystem.core.utilities.results.Result;
import com.hrmsSystem.hrmsSystem.core.utilities.results.SuccessDataResult;
import com.hrmsSystem.hrmsSystem.core.utilities.results.SuccessResult;
import com.hrmsSystem.hrmsSystem.dataAccess.abstracts.WorkPositionDao;
import com.hrmsSystem.hrmsSystem.entities.concretes.WorkPosition;

@Service
public class WorkPositionManager implements PositionService{

	WorkPositionDao workPositionDao;
	
	@Autowired
	public WorkPositionManager(WorkPositionDao workPositionDao) {
		super();
		this.workPositionDao = workPositionDao;
	}


	public Result add(WorkPosition workPosition) {
		if((workPositionDao.findByname(workPosition.getName()) == null)) {
			
			workPositionDao.save(workPosition);
			return new SuccessResult("is pozisyonu ekleme basarili");
		}
		
		else {
			return new ErrorResult("is pozisyonu eklenemedi");
		}
		
	}
	
	public DataResult<List<WorkPosition>> getAll(){
		return new SuccessDataResult<List<WorkPosition>>(workPositionDao.findAll() , "basarili bir sekilde data aktarildi");
	}
}
