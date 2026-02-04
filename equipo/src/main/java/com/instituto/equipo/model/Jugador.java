package com.instituto.equipo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Jugador {
	
	@Id //DEFINE LA CLAVE PRIMARIA
	@GeneratedValue(strategy=GenerationType.IDENTITY) //PARA QUE LA CLAVE PRIMARIA SEA AUTO-INCREMENTAL
	private Long id;//long
	
	private String nombre;//varchar 255
	private String posicion;//varchar 255
	private int dorsal;//int
	
	//Necesitamos el constructor vacio para JPA
	public Jugador() {}
	
	public Jugador(Long id, String nombre, String posicion, int dorsal) {
		this.id = id;
		this.nombre = nombre;
		this.posicion = posicion;
		this.dorsal = dorsal;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	
	
}
