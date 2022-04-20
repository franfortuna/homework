package it.uniroma3.siw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Società {


	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;

	@Column(nullable=false)
	private String via;
	private int numCivico;
	private String comune;
	private int cap;
	private String provincia;

	@Column(nullable=false)
	private String ragioneSociale;
	private int numeroTelefono;



	public Società(Long id, String via, int numCivico, String comune, int cap, String provincia, String ragioneSociale,
			int numeroTelefono) {
		super();
		this.id = id;
		this.via = via;
		this.numCivico = numCivico;
		this.comune = comune;
		this.cap = cap;
		this.provincia = provincia;
		this.ragioneSociale = ragioneSociale;
		this.numeroTelefono = numeroTelefono;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public int getNumCivico() {
		return numCivico;
	}

	public void setNumCivico(int numCivico) {
		this.numCivico = numCivico;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}


	public int getCap() {
		return cap;
	}


	public void setCap(int cap) {
		this.cap = cap;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public String getRagioneSociale() {
		return ragioneSociale;
	}



	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}



	public int getNumeroTelefono() {
		return numeroTelefono;
	}



	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}



}
