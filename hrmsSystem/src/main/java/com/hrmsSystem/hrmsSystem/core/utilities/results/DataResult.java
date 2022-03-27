package com.hrmsSystem.hrmsSystem.core.utilities.results;

import javax.xml.transform.Result;

public class DataResult<T> extends com.hrmsSystem.hrmsSystem.core.utilities.results.Result {

	
	T data;
	public DataResult(T data,boolean success) {
		super(success);
		this.data = data;
		
	}

	public DataResult(T data,boolean success, String message) {
		super(success, message);
		this.data = data;
	}
	public T getData() {
		return data;
	}


}
