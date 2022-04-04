package com.hrmsSystem.hrmsSystem.core.adapters.concretes;

import java.rmi.RemoteException;
import java.util.Locale;

import com.hrmsSystem.hrmsSystem.core.adapters.abstracts.MernisCheckService;
import com.hrmsSystem.hrmsSystem.core.utilities.results.ErrorResult;
import com.hrmsSystem.hrmsSystem.core.utilities.results.Result;
import com.hrmsSystem.hrmsSystem.core.utilities.results.SuccessResult;
import com.hrmsSystem.hrmsSystem.entities.concretes.JobSeeker;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisCheckManager implements MernisCheckService{

	


	@Override
	public Result check(JobSeeker jobSeeker) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = kpsPublic.TCKimlikNoDogrula(jobSeeker.getTcNo() , jobSeeker.getName().toUpperCase(new Locale("tr","TR")), jobSeeker.getSurName().toUpperCase(new Locale("tr","TR")), Integer.parseInt(jobSeeker.getBirthDay()));
		
		if(!result) {
			return new ErrorResult();
		}
		else {
		return new SuccessResult();
		}
	}

}
