package com.curfing.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.curfing.domain.atmosphereVO;
import com.curfing.mapper.atmosphereMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@RequiredArgsConstructor
public class atmosphereServiceImpl implements atmosphereService{

		private final atmosphereMapper mapper;
		
	@Override
	public List<atmosphereVO> atmosphereList() {
		log.info("atmosphereList..........");
		return mapper.atmosphereList(); //리스트 가져다 줌
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public atmosphereVO get(Long bno) {
		log.info("get....");
		
		return mapper.read(bno);
	}


	
}
