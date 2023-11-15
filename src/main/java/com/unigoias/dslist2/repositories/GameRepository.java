package com.unigoias.dslist2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unigoias.dslist2.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
