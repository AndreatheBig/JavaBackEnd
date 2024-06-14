package com.spotify.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spotify.demo.entities.Brano;
import com.spotify.demo.repos.BranoDAO;

@Service
public class BranoServiceImpl implements BranoService {
	
	@Autowired
	private BranoDAO dao;
	
	@Override
	public List<Brano> getBrani() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}
