package com.esteban.demo.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name="persons")

public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String firstName;
    private String lastName;

    @Column(updatable=false)

    private Date createdAt;
    private Date updatedAt;

    @OneToOne(mappedBy="person", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    
    /*
     * @OneToOne(mappedBy="person"): Esto asignará el atributo license en la clase Person al atributo 
     * person  en la clase License. Representa el campo que posee la relación. Este elemento solo se 
     * especifica en el lado inverso (no en su propia entidad) de la asociación.
     * 
     * @OneToOne(cascade=CascadeType.ALL): Las operaciones que deben conectarse en cascada con la 
     * asociación. Esto asegura que la integridad de referencias se preserve en TODAS las acciones.
     * 
     * @OneToOne(fetch=FetchType.LAZY): Si la asociación debe ser cargada como LAZY o debe cargarse 
     * como EAGER.
     * 
     * LAZY: La asociación es buscada cuando se necesita.
     * EAGER: La asociación es buscada inmediatamente.
     * 
     * */

    private License license;

    public Person() {

    }
    
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	//getters y setters
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public License getLicense() {
		return license;
	}

	public void setLicense(License license) {
		this.license = license;
	}

}