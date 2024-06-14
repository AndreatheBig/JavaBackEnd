package com.spotify.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spotify.demo.entities.Brano;
import com.spotify.demo.service.BranoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api")
public class BranoREST {
	
	@Autowired
	BranoService service;

	@GetMapping("brani")
	public List<Brano> getbrani() {
		return service.getBrani();
	}
	
	
}
