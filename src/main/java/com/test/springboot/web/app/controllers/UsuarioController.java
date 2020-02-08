package com.test.springboot.web.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.springboot.web.app.models.Usuario;
import com.test.springboot.web.app.repository.IUsuarioRepositorio;

@Controller
public class UsuarioController {
	
	@Autowired
	private IUsuarioRepositorio usuarioRepositorio;
	
	@GetMapping("/register")
	public String index(Model model) {
		return "index";
	}
	
	@PostMapping(value="basicForm")
	public String basicForm(String nombre, String apellido) {
		
		Usuario usuario = new Usuario(nombre, apellido);
		usuarioRepositorio.save(usuario);
		return "index";
	}
	
	@GetMapping("/history")
	public String history(Model model) {
		model.addAttribute("usuarios", usuarioRepositorio.findAll());
		return "history";
	}
	
	@PostMapping("users")
	public String usersUpdate(@RequestParam(value = "usersId") Usuario[] usersId) {
		
		return "history";
	}

}
