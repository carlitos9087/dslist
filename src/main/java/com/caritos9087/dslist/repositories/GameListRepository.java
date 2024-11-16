package com.caritos9087.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caritos9087.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
