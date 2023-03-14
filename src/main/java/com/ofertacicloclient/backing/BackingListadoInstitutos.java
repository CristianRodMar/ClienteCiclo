package com.ofertacicloclient.backing;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.ofertacicloclient.model.Ies;
import com.ofertacicloclient.model.IesPaginado;
import com.ofertacicloclient.model.Ofertaeducativa;
import com.ofertacicloclient.services.ClienteApiCicloRest;

import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class BackingListadoInstitutos implements Serializable {
	private static final long serialVersionUID = 1L;

	IesPaginado iesPaginado;
	List<Ofertaeducativa> listaOferta = null;
	int paginaActual = 0;
	
	public BackingListadoInstitutos() {
		
	}
	
	@PostConstruct
	public void init() {
		iesPaginado = ClienteApiCicloRest.getIesPaginado(paginaActual);
		
	}
	
	public void paginaSiguiente() {
		if (paginaActual < iesPaginado.getTotalPages()) {
			paginaActual++;
			iesPaginado = ClienteApiCicloRest.getIesPaginado(paginaActual);
			listaOferta = null;
		}	
	}
	
	public void paginaAnterior() {
		if (paginaActual > 0) {
			paginaActual--;
			iesPaginado = ClienteApiCicloRest.getIesPaginado(paginaActual);
			listaOferta = null;
		}
	}
	
	public void getOfertaCiclos(long idies) {
		for (Ies i : iesPaginado.getIesList()) {
			if (i.getIdies() == idies) {
				listaOferta = i.getOfertaeducativa();
			}
		}
	}
	
	public List<Ofertaeducativa> getListaOferta() {
		return listaOferta;
	}

	public void setListaOferta(List<Ofertaeducativa> listaOferta) {
		this.listaOferta = listaOferta;
	}

	public IesPaginado getIesPaginado() {
		return iesPaginado;
	}

	public void setIesPaginado(IesPaginado iesPaginado) {
		this.iesPaginado = iesPaginado;
	}

	public int getPaginaActual() {
		return paginaActual;
	}

	public void setPaginaActual(int paginaActual) {
		this.paginaActual = paginaActual;
	}

	
	
}
