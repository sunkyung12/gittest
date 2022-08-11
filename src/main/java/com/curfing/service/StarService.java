package com.curfing.service;

import java.util.List;


import com.curfing.domain.StarVO;

public interface StarService {
	
	public StarVO get (Long bno); //한껀
	
	public List<StarVO> StarList(); //모두읽기
	void insert();
	void delete();
	void update();

;
	
}
