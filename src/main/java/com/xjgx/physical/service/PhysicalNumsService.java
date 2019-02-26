package com.xjgx.physical.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xjgx.physical.repository.PhysicalNumsRepository;

@Service
public class PhysicalNumsService {
	
	@Resource
	private PhysicalNumsRepository physicalNumsRepository ;
	
}
