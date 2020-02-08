package com.test.springboot.web.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.test.springboot.web.app.models.Usuario;

public interface IUsuarioRepositorio extends JpaRepository<Usuario, Long> {
	


}
