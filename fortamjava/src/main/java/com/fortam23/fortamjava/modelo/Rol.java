package com.fortam23.fortamjava.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//Nombre de la tabla
@Table(name = "rol")
public class Rol {

	@Id
	// Id auto incrementable
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// atributos
	private Long id_Rol;
	private String Nombre_Rol;

	// Gettes and Setters
	public Long getId_Rol() {
		return id_Rol;
	}

	public void setId_Rol(Long id_Rol) {
		this.id_Rol = id_Rol;
	}

	public String getNombre_Rol() {
		return Nombre_Rol;
	}

	public void setNombre_Rol(String nombre_Rol) {
		Nombre_Rol = nombre_Rol;
	}

	// Constructor con todos los atributos
	public Rol(Long id_Rol, String nombre_Rol) {
		this.id_Rol = id_Rol;
		Nombre_Rol = nombre_Rol;
	}

	// Constructor con todos los atributos menos la Id
	public Rol(String nombre_Rol) {
		Nombre_Rol = nombre_Rol;
	}

	// Constructor vacio
	public Rol() {
	}

}
