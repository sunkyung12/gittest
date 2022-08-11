package com.curfing.mapper;

import java.util.List;

import com.curfing.domain.atmosphereVO;

public interface atmosphereMapper {//다오역할

	public List<atmosphereVO> atmosphereList();//리스트 나열 
	
	public void insert(atmosphereVO star);
	
	public void insertSelectKey(atmosphereVO star);
	
	public atmosphereVO read(Long bno);


	
	
	
}
