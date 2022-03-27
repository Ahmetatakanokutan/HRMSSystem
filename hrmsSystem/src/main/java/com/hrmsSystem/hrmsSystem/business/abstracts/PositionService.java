package com.hrmsSystem.hrmsSystem.business.abstracts;

import java.util.List;

import com.hrmsSystem.hrmsSystem.core.utilities.results.DataResult;
import com.hrmsSystem.hrmsSystem.core.utilities.results.Result;
import com.hrmsSystem.hrmsSystem.entities.concretes.WorkPosition;

public interface PositionService {

	public Result add(WorkPosition workPosition);
	public DataResult<List<WorkPosition>> getAll();
}
