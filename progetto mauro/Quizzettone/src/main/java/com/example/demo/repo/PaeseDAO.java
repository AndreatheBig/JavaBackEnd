package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Paese;

public interface PaeseDAO extends JpaRepository<Paese, Integer> {

	@Query(value="select * from paese order by rand() limit 3 ", nativeQuery = true)
	List<Paese> findPaesiRandom();
	
}
