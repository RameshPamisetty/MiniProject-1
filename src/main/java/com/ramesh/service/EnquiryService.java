package com.ramesh.service;

import java.util.List;

import com.ramesh.binding.SearchCriteria;
import com.ramesh.entity.StudentEnq;

public interface EnquiryService {

	public boolean addEnq(StudentEnq se);

	public List<StudentEnq> getEnquiries(Integer cid, SearchCriteria s);
}
