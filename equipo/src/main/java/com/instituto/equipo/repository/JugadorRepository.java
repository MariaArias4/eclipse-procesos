package com.instituto.equipo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.instituto.equipo.model.Jugador;

//ESTA INTERFAZ CONTIENE TODAS LAS OPERACIONES
public interface JugadorRepository extends JpaRepository<Jugador, Long> {
	
}
