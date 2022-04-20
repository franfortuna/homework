package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class JPACorso {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(nullable=false)
	private String nome;
	private String cognome;

	@Column(nullable=false)
	private LocalDate dataInizio;
	private LocalDate durataEffettiva;
	

	public JPACorso(String nome, String cognome, LocalDate dataInizio, LocalDate durataEffettiva) {
		this.nome=nome;
		this.cognome=cognome;
		this.dataInizio=dataInizio;
		this.durataEffettiva=durataEffettiva;

	}

	@ManyToMany (mappedBy="corsi")
	private List<Allievo>allievi;
	
	@ManyToOne(cascade= {CascadeType.PERSIST})
	private Docente docente;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public LocalDate getDurataEffettiva() {
		return durataEffettiva;
	}

	public void setDurataEffettiva(LocalDate durataEffettiva) {
		this.durataEffettiva = durataEffettiva;
	}

	public List<Allievo> getAllievi() {
		return allievi;
	}

	public void setAllievi(List<Allievo> allievi) {
		this.allievi = allievi;
	}









}
