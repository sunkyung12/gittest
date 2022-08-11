package com.curfing.mapper;

import java.util.List;

import com.curfing.domain.RisingVO;
import com.curfing.domain.StarVO;

public interface RisingMapper {//다오역할

	public List<RisingVO> RisingList();//리스트 나열 
	
	public void insert(RisingVO star);
	
	public void insertSelectKey(RisingVO star);
	
	public StarVO read(Long bno);
	
	
}
