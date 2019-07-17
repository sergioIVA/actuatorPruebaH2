package com.com.ceiba.core.dao.usuario;

import java.util.List;



public interface DaoUsuario {

	/**
	 * Permite listar usuarios
	 * @return los usuarios
	 */
	List<DtoUsuario> listar();

}