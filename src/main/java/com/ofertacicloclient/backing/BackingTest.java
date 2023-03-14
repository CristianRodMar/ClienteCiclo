package com.ofertacicloclient.backing;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.ofertacicloclient.model.Ies;
import com.ofertacicloclient.services.ClienteApiCicloRest;

@Named
@ViewScoped
public class BackingTest implements Serializable{
	private static final long serialVersionUID = 1L;
	
	List<Ies> listaIes;

	public BackingTest() {
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void init() {
		listaIes = ClienteApiCicloRest.getAllIes();
	}

	public List<Ies> getListaIes() {
		return listaIes;
	}

	public void setListaIes(List<Ies> listaIes) {
		this.listaIes = listaIes;
	}
	
	

}
