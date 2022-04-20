package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Docente {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;

	@Column(nullable=false)
	private String nome;
	private String cognome;

	@Column(nullable=false)
	private LocalDate data;
	private String nascita;

	@Column(nullable=false)
	private String partitaIva;


	public Docente(Long id, String nome, String cognome, LocalDate data, String nascita, String partitaIva) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.data = data;
		this.nascita = nascita;
		this.partitaIva = partitaIva;
	}


	@OneToMany (mappedBy="docente", cascade ={CascadeType.PERSIST, CascadeType.REMOVE })
	private List<JPACorso>corsi;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	public String getNascita() {
		return nascita;
	}


	public void setNascita(String nascita) {
		this.nascita = nascita;
	}


	public String getPartitaIva() {
		return partitaIva;
	}


	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}


	public List<JPACorso> getCorsi() {
		return corsi;
	}


	public void setCorsi(List<JPACorso> corsi) {
		this.corsi = corsi;
	}



}
