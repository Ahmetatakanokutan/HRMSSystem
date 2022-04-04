package com.hrmsSystem.hrmsSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrmsSystem.hrmsSystem.business.abstracts.PositionService;
import com.hrmsSystem.hrmsSystem.core.utilities.results.DataResult;
import com.hrmsSystem.hrmsSystem.core.utilities.results.Result;
import com.hrmsSystem.hrmsSystem.entities.concretes.WorkPosition;

@RestController
@RequestMapping("/api/workposition")
public class WorkPositionController {
	
	PositionService positionService;
	
	@Autowired
	public WorkPositionController(PositionService positionService) {
		super();
		this.positionService = positionService;
	}


	@GetMapping("/getAll")
	public DataResult<List<WorkPosition>> getAll(){
		
		return positionService.getAll();
		
	}

	
	@PostMapping("/add")
	public Result add(WorkPosition workPosition) {
		
		return positionService.add(workPosition);
	}
}
