package com.fortam23.fortamjava.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fortam23.fortamjava.modelo.Usuario;

@Repository
//Se utiliza un interface y se usa la anotacion JpaRepository donde se importa el modelo usuario y el tipo de valor Long
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
	
	//Aqui se implementa el atributo que debe ser unico y se importa del modelo usuario
	public Usuario findByEmail(String email);
	
}
