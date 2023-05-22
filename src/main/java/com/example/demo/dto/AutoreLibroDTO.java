package com.example.demo.dto;

public class AutoreLibroDTO {

	private String nome;
	private String cognome;
	private Long quantiLibri;

	public AutoreLibroDTO(String nome, String cognome, Long quantiLibri) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.quantiLibri = quantiLibri;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Long getQuantiLibri() {
		return quantiLibri;
	}

	public void setQuantiLibri(Long quantiLibri) {
		this.quantiLibri = quantiLibri;
	}

	@Override
	public String toString() {
		return "AutoreLibroDTO [nome=" + nome + ", cognome=" + cognome + ", quantiLibri=" + quantiLibri + "]";
	}

}
