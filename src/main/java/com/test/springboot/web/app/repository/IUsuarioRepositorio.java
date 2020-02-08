package com.test.springboot.web.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.springboot.web.app.models.Usuario;

public interface IUsuarioRepositorio extends JpaRepository<Usuario, Long> {

}
