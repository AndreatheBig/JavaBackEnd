package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Paese;
import com.example.demo.repo.PaeseDAO;

@Service
public class PaeseServiceImpl implements paeseService {
	
	@Autowired
	private PaeseDAO dao;

	@Override
	public List<Paese> getPaesi() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Paese> getPaesiRandom() {
		
		return dao.findPaesiRandom();
		//return dao.findAll().stream().limit(3).toList(); 
	}

}
