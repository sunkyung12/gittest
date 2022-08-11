package com.curfing.mapper;

import java.util.List;

import com.curfing.domain.StarVO;

public interface StarMapper {//다오역할

	public List<StarVO> StarList();//리스트 나열 
	
	public void insert(StarVO star);
	
	public void insertSelectKey(StarVO star);
	
	public StarVO read(Long bno);
	
	
}
