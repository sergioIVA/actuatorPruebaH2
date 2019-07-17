package com.com.ceiba.core.dao.usuario;

import java.util.List;

import org.springframework.stereotype.Component;

import com.com.ceiba.core.repositorio.CustomNamedParameterJdbcTemplate;
import com.com.ceiba.core.repositorio.SqlStatement;


@Component
public class DaoUsuarioMysql implements DaoUsuario {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;
    
    @SqlStatement(namespace="usuario", value="listar")
	private String sqlListar;

    public DaoUsuarioMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
	public List<DtoUsuario> listar() {
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar, new MapeoUsuario());
    }
}
