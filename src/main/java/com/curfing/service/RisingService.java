package com.curfing.service;

import java.util.List;

import com.curfing.domain.RisingVO;

public interface RisingService {
	
	public RisingVO get (Long bno); //한껀
	
	public List<RisingVO> RisingList(); //모두읽기
	void insert();
	void delete();
	void update();
	
}
