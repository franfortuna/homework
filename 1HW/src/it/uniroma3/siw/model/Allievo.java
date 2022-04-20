package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Allievo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long matricola;

	@Column(nullable=false)
	private String nome;
	private String cognome;

	@Column(nullable=false)
	private LocalDate dataDiNascita;

	@Column(nullable=false)
	private String luogoDiNascita;

	@Column(nullable=false)
	private String email;



	public Allievo(long matricola, String nome, String cognome, LocalDate dataDiNascita, String luogoDiNascita,
			String email) {
		super();
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.luogoDiNascita = luogoDiNascita;
		this.email = email;

	}

	@ManyToMany(fetch=FetchType.EAGER)
	private List<JPACorso>corsi;
	
	@ManyToOne
	private Società società;



	public long getMatricola() {
		return matricola;
	}

	public void setMatricola(long matricola) {
		this.matricola = matricola;
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

	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getLuogoDiNascita() {
		return luogoDiNascita;
	}

	public void setLuogoDiNascita(String luogoDiNascita) {
		this.luogoDiNascita = luogoDiNascita;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<JPACorso> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<JPACorso> corsi) {
		this.corsi = corsi;
	}
}
