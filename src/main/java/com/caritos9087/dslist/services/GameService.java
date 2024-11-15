package com.caritos9087.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caritos9087.dslist.dto.GameMinDTO;
import com.caritos9087.dslist.entities.Game;
import com.caritos9087.dslist.repositories.GameRepository;

@Service
public class GameService {

	
	@Autowired
	private GameRepository gameReppository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameReppository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
}
