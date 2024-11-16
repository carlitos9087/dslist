package com.caritos9087.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caritos9087.dslist.entities.Game;



public interface GameRepository extends JpaRepository<Game, Long> {

}
