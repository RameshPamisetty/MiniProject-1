package com.ramesh.service;

import com.ramesh.binding.DashboardResponse;
import com.ramesh.entity.Counsellor;

public interface CounsellorService {

	public String saveCounsellor(Counsellor c);
	 
	public Counsellor loginCheck(String email, String pwd);

	public boolean recoverPwd(String email);

	public DashboardResponse getDashboardInfo(Integer cid);

}
