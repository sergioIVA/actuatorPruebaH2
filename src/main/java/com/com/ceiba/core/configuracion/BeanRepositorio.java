package com.com.ceiba.core.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.com.ceiba.core.repositorio.CustomNamedParameterJdbcTemplate;
import com.com.ceiba.core.repositorio.RepositorioUsuario;
import com.com.ceiba.core.repositorio.RepositorioUsuarioMysql;



@Configuration
public class BeanRepositorio {

	@Bean
	public RepositorioUsuario repositorioUsuario(CustomNamedParameterJdbcTemplate repositorioGenerico) {
		return new RepositorioUsuarioMysql(repositorioGenerico);
	}

}
