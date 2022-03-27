package com.hrmsSystem.hrmsSystem.business.abstracts;

import java.util.List;

import com.hrmsSystem.hrmsSystem.core.utilities.results.DataResult;
import com.hrmsSystem.hrmsSystem.core.utilities.results.Result;
import com.hrmsSystem.hrmsSystem.entities.concretes.Employer;

public interface EmployerService {

	public DataResult<List<Employer>> getAll();
	public Result addToSystem(Employer employer);
}
