package com.pms.pensioner.detail.service;

import com.pms.pensioner.detail.exception.AadharNumberNotFound;
import com.pms.pensioner.detail.model.PensionerDetail;

public interface PensionerDetailService {
	
	public PensionerDetail getPensionerDetailByAadharCard(String token,long aadharNumber) throws AadharNumberNotFound;

}
