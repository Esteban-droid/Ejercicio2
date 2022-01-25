package com.esteban.demo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity //establece entidad

@Table(name="autores") //establece tabla

public class Autor {
	
	@Id //establece campo como clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //lo establece como autoincrementable

    private Long id;
    @Size(min = 2, max = 200) //Agrega la validación a la columna para que esté dentro del rango especificado

    private String nombre;

    @Size(min = 5, max = 200)

    private String descripcion;

    @Size(min = 2, max = 200)

    private String apellido;

    // Esto no permitirá que el campo createdAt sea modificado después de su creación.

    @Column(updatable=false)

    @DateTimeFormat(pattern="yyyy-MM-dd")

    private Date createdAt;

    @DateTimeFormat(pattern="yyyy-MM-dd")

    private Date updatedAt;

    

    public Autor() {

    }
    
    public Autor(String nombre, String descripcion, String apellido) {

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.apellido = apellido;

    }
    
    @PrePersist //Ejecuta el método justo antes que el objeto sea creado

    protected void onCreate(){

        this.createdAt = new Date();

    }

    @PreUpdate //Ejecuta el método cuando el objeto es modificado

    protected void onUpdate(){

        this.updatedAt = new Date();

    }
    
    //getters y setters

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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
    
    

}
