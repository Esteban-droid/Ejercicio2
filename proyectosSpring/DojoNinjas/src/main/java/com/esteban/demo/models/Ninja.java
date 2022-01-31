package com.esteban.demo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name="ninjas")

public class Ninja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private int age;

    @Column(updatable=false)

    private Date createdAt;
    private Date updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    
    /*@ManyToOne: Define una asociación de un solo valor a otra clase entidad que tiene una 
     * multiplicidad de Muchos-a-Uno. Esto se pude usar dentro de una clase entidad para 
     * especificar una relación de la clase con una sola entidad. Tenga en cuenta que nuestro 
     * atributo dojo se refiere a dojo_id. Por lo tanto, este atributo proporciona el dojo al 
     * que pertenece un ninja específico.*/

    @JoinColumn(name="dojo_id")
    
    /*@JoinColumn(name="dojo_id"): Define la asignación de claves foráneas compuestas. 
     * Indica que la tabla correspondiente a esta entidad tiene una clave foránea a 
     * la tabla referenciada.*/

    private Dojo dojo;

    public Ninja() {

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public Dojo getDojo() {
		return dojo;
	}

	public void setDojo(Dojo dojo) {
		this.dojo = dojo;
	}
}