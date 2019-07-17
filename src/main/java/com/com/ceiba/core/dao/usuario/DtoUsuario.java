package com.com.ceiba.core.dao.usuario;

import java.time.LocalDateTime;



public class DtoUsuario {

	private Long id;
    private String nombre;
    private String clave;
    private LocalDateTime fechaCreacion;
    
   public DtoUsuario(Long id, String nombre, String clave, LocalDateTime fechaCreacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.clave = clave;
		this.fechaCreacion = fechaCreacion;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
    
    
    
}
