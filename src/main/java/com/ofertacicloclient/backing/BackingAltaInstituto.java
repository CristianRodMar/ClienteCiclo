package com.ofertacicloclient.backing;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.ofertacicloclient.model.Ies;
import com.ofertacicloclient.services.ClienteApiCicloRest;

import java.io.Serializable;

@Named
@ViewScoped
public class BackingAltaInstituto implements Serializable {
	private static final long serialVersionUID = 1L;

	Ies ies = new Ies();
	
	public BackingAltaInstituto() {
		// TODO Auto-generated constructor stub
	}
	
	public void nuevoIes() {
		ies = ClienteApiCicloRest.addIes(ies);
		FacesContext context = FacesContext.getCurrentInstance();
		if (ies.getNombre() == null) {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Ya existe ese instituto", "Ya existe ese instituto"));
		} else {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Instituto dado de alta con éxito", "Instituto dado de alta con éxito"));
			ies = new Ies();
		}
	}

	public Ies getIes() {
		return ies;
	}

	public void setIes(Ies ies) {
		this.ies = ies;
	}
	
	

}
