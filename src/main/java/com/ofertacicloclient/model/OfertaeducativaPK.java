package com.ofertacicloclient.model;

import java.io.Serializable;

public class OfertaeducativaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private long idies;

	private long idciclo;

	private long idturno;

	public OfertaeducativaPK() {
	}
	public long getIdies() {
		return this.idies;
	}
	public void setIdies(long idies) {
		this.idies = idies;
	}
	public long getIdciclo() {
		return this.idciclo;
	}
	public void setIdciclo(long idciclo) {
		this.idciclo = idciclo;
	}
	public long getIdturno() {
		return this.idturno;
	}
	public void setIdturno(long idturno) {
		this.idturno = idturno;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OfertaeducativaPK)) {
			return false;
		}
		OfertaeducativaPK castOther = (OfertaeducativaPK)other;
		return 
			(this.idies == castOther.idies)
			&& (this.idciclo == castOther.idciclo)
			&& (this.idturno == castOther.idturno);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.idies ^ (this.idies >>> 32)));
		hash = hash * prime + ((int) (this.idciclo ^ (this.idciclo >>> 32)));
		hash = hash * prime + ((int) (this.idturno ^ (this.idturno >>> 32)));
		
		return hash;
	}
}