package com.ofertacicloclient.model;

import java.io.Serializable;

public class Ofertaeducativa implements Serializable {
	private static final long serialVersionUID = 1L;

	private OfertaeducativaPK id;

	private int plazas;

	private Ciclo ciclo;

	private Ies ies;

	private Turno turno;

	public Ofertaeducativa() {
	}

	public OfertaeducativaPK getId() {
		return this.id;
	}

	public void setId(OfertaeducativaPK id) {
		this.id = id;
	}

	public int getPlazas() {
		return this.plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public Ciclo getCiclo() {
		return this.ciclo;
	}

	public void setCiclo(Ciclo ciclo) {
		this.ciclo = ciclo;
	}

	public Ies getIes() {
		return this.ies;
	}

	public void setIes(Ies ies) {
		this.ies = ies;
	}

	public Turno getTurno() {
		return this.turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

}