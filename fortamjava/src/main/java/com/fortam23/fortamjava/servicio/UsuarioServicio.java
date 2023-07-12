package com.fortam23.fortamjava.servicio;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.fortam23.fortamjava.controlador.dto.UsuarioRegistroDTO;
import com.fortam23.fortamjava.modelo.Usuario;

public interface UsuarioServicio extends UserDetailsService {
	// Aqui se guardar los datos que se ingresan en el registro
	public Usuario guardar(UsuarioRegistroDTO registroDTO);

	// Se crea la lista de los usuario ingresados
	public List<Usuario> listarUsuarios();

}
