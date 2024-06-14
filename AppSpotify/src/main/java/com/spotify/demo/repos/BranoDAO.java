package com.spotify.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spotify.demo.entities.Brano;

public interface BranoDAO extends JpaRepository<Brano, Integer>{

}
