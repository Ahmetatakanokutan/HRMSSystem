package com.hrmsSystem.hrmsSystem.core.adapters.concretes;

import java.rmi.RemoteException;

import com.hrmsSystem.hrmsSystem.business.abstracts.JobSeekerService;
import com.hrmsSystem.hrmsSystem.core.adapters.abstracts.MernisCheckService;
import com.hrmsSystem.hrmsSystem.entities.concretes.JobSeeker;

import tr.gov.nvi.tckimlik.WS.KPSPublic;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisCheckManager implements MernisCheckService{

	KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
	@Override
	public boolean check(JobSeeker jobSeeker) throws NumberFormatException,RemoteException {
		return kpsPublic.TCKimlikNoDogrula(jobSeeker.getTcNo(),jobSeeker.getName(), jobSeeker.getSurName(), jobSeeker.getBirthDay());
	}

}
