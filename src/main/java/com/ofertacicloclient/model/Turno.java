package com.ofertacicloclient.model;

import java.io.Serializable;

public class Turno implements Serializable {
	private static final long serialVersionUID = 1L;

	private long idturno;

	private String descripcion;

	public Turno() {
	}

	public long getIdturno() {
		return this.idturno;
	}

	public void setIdturno(long idturno) {
		this.idturno = idturno;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}