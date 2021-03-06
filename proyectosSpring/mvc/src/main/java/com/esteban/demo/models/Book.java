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
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity //establece entida

@Table(name="books") //establece tabla

public class Book {

    @Id //establece campo como clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //lo establece como autoincrementable

    private Long id;
    @Size(min = 5, max = 200) //Agrega la validación a la columna para que esté dentro del rango especificado

    private String title;

    @Size(min = 5, max = 200)

    private String description;

    @Size(min = 3, max = 40)

    private String language;

    @Min(100) //Agrega la validación a la columna para que al menos contenga ese valor

    private Integer numberOfPages;

    // Esto no permitirá que el campo createdAt sea modificado después de su creación.

    @Column(updatable=false)

    @DateTimeFormat(pattern="yyyy-MM-dd")

    private Date createdAt;

    @DateTimeFormat(pattern="yyyy-MM-dd")

    private Date updatedAt;

    

    public Book() {

    }

    public Book(String title, String desc, String lang, int pages) {

        this.title = title;
        this.description = desc;
        this.language = lang;
        this.numberOfPages = pages;

    }

    

    // Otros getters y setters fueron removidos para resumir

    @PrePersist //Ejecuta el método justo antes que el objeto sea creado

    protected void onCreate(){

        this.createdAt = new Date();

    }

    @PreUpdate //Ejecuta el método cuando el objeto es modificado

    protected void onUpdate(){

        this.updatedAt = new Date();

    }
    
    
    //------------------------------------------------------------------------------
    
    //getters y setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
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
