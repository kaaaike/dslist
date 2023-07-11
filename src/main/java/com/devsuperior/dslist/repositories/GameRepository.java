package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

// Consulta com o banco utilizando o framework JPA do Spring, agilidade em consultas no db.

public interface GameRepository extends JpaRepository<Game, Long> {
	
	

}
