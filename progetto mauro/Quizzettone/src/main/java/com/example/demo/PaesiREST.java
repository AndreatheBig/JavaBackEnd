package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Paese;
import com.example.demo.service.paeseService;


@RestController
@RequestMapping("api")
public class PaesiREST {
	
	@Autowired
	paeseService service;
	
	@GetMapping("paese")
	public List<Paese> getPaese() {
		return service.getPaesi();
	}
	@GetMapping("paesirandom")
	public List<Paese> getPaesirandom() {
		return service.getPaesiRandom();
	}
	

}
