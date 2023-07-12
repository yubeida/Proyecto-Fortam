package com.fortam23.fortamjava.controlador.dto;

//El modelo que en este caso es Usuario pero aqui no se tiene en cuenta las anotaciones de table, entity ni la cardinalidad
public class UsuarioRegistroDTO {

	// Atributos
	private Long id_Usuario;
	private String nombre;
	private String identificacion;
	private String email;
	private String password;

	// Setters and Getters
	public Long getId_Usuario() {
		return id_Usuario;
	}

	public void setId_Usuario(Long id_Usuario) {
		this.id_Usuario = id_Usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// Constructor donde no se tiene en cuenta la id
	public UsuarioRegistroDTO(String nombre, String identificacion, String email, String password) {
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.email = email;
		this.password = password;
	}

	// Constructor vacio
	public UsuarioRegistroDTO() {
	}

}
