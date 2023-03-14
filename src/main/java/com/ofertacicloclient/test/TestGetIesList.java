package com.ofertacicloclient.test;

import java.util.List;

import com.ofertacicloclient.model.Ies;
import com.ofertacicloclient.services.ClienteApiCicloRest;

public class TestGetIesList {

	public static void main(String[] args) {
		
		List<Ies> listaIes = ClienteApiCicloRest.getAllIes();
		for (Ies i : listaIes) {
			System.out.println(i.getNombre());
		}

	}

}
