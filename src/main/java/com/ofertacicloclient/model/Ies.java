package com.ofertacicloclient.model;

import java.io.Serializable;
import java.util.List;

public class Ies implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long idies;

	private String nombre;

	private List<Ofertaeducativa> ofertaeducativa;

	public Ies() {
	}

	public Long getIdies() {
		return this.idies;
	}

	public void setIdies(Long idies) {
		this.idies = idies;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Ofertaeducativa> getOfertaeducativa() {
		return this.ofertaeducativa;
	}

	public void setOfertaeducativa(List<Ofertaeducativa> ofertaeducativa) {
		this.ofertaeducativa = ofertaeducativa;
	}

	public Ofertaeducativa addOfertaeducativa(Ofertaeducativa ofertaeducativa) {
		getOfertaeducativa().add(ofertaeducativa);
		ofertaeducativa.setIes(this);

		return ofertaeducativa;
	}

	public Ofertaeducativa removeOfertaeducativa(Ofertaeducativa ofertaeducativa) {
		getOfertaeducativa().remove(ofertaeducativa);
		ofertaeducativa.setIes(null);

		return ofertaeducativa;
	}

}