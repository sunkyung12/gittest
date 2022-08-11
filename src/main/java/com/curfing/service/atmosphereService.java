package com.curfing.service;

import java.util.List;

import com.curfing.domain.atmosphereVO;

public interface atmosphereService {
	
	public atmosphereVO get (Long bno); //한껀
	
	public List<atmosphereVO> atmosphereList(); //모두읽기
	void insert();
	void delete();
	void update();

	

	

;
	
}
