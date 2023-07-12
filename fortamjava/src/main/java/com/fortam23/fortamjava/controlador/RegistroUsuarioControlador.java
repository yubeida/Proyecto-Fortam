package com.fortam23.fortamjava.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fortam23.fortamjava.controlador.dto.UsuarioRegistroDTO;
import com.fortam23.fortamjava.servicio.UsuarioServicio;

@Controller
@RequestMapping("/registro")
public class RegistroUsuarioControlador {
	// Se importa del paquete service
	private UsuarioServicio usuarioServicio;

	// Constructor de service
	public RegistroUsuarioControlador(UsuarioServicio usuarioServicio) {
		super();
		this.usuarioServicio = usuarioServicio;
	}

	// El modelo que es usuario
	@ModelAttribute("usuario")
	public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {
		return new UsuarioRegistroDTO();
	}

	// El html a utilizar que en este caso es index para mostrar los datos
	@GetMapping
	public String mostrarFormularioDeRegistro() {
		return "registro";
	}

	// La accion que se llevara a cabo en registro y el mensaje que debe generar a
	// la hora de ingresar los datos
	@PostMapping
	public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO) {
		usuarioServicio.guardar(registroDTO);
		return "redirect:/registro?exito";
	}
}
