package com.unigoias.dslist2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unigoias.dslist2.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
