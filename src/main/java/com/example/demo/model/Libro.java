package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String titolo;
	private Integer pagine;

	@ManyToOne
	@JoinColumn(name = "autore_id")
	private Autore autore;
	
	public Libro() {}

	public Libro(String titolo, Integer pagine, Autore autore) {
		super();
		this.titolo = titolo;
		this.pagine = pagine;
		this.autore = autore;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Integer getPagine() {
		return pagine;
	}

	public void setPagine(Integer pagine) {
		this.pagine = pagine;
	}

	public Autore getAutore() {
		return autore;
	}

	public void setAutore(Autore autore) {
		this.autore = autore;
	}

}
