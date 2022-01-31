package com.esteban.demo.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table(name="dojos")

public class Dojo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;

    @OneToMany(mappedBy="dojo", fetch = FetchType.LAZY)
    
    /*@OneToMany: Define una asociación de muchos valores con multiplicidad de Uno-a-Muchos. 
     * Esto se puede usar dentro de una clase entidad para especificar una relación 
     * de la clase con una colección de entidades. 
     * 
     * @OneToMany(mappedBy="dojo"): Esto asignará el atributo ninjas en la clase Dojo al atributo 
     * dojo de la clase Ninja.
     * */

    private List<Ninja> ninjas;

    public Dojo() {


    }

    //getters y setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public List<Ninja> getNinjas() {
		return ninjas;
	}

	public void setNinjas(List<Ninja> ninjas) {
		this.ninjas = ninjas;
	}
}