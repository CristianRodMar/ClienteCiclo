package com.ofertacicloclient.services;

import java.lang.reflect.Type;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.client.Entity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ofertacicloclient.model.Ies;
import com.ofertacicloclient.model.IesPaginado;

public final class ClienteApiCicloRest {
	
	final static String BASE_URI = "http://localhost:8081/api";
	static Client cliente = ClientBuilder.newClient();
	
	public static List<Ies> getAllIes() {
		List<Ies> listaIes = null;
		String uri = BASE_URI + "/institutos";
		WebTarget target = cliente.target(uri);
		Invocation invocation = target.request(MediaType.APPLICATION_JSON).buildGet();
		Response response = invocation.invoke();
		String body = response.readEntity(String.class);
		Gson gson = new Gson();
		final Type tipoListaIes = new TypeToken<List<Ies>>() {
		}.getType();
		listaIes = gson.fromJson(body, tipoListaIes);
		return listaIes;
	}
	
	public static Ies addIes(Ies ies) {
		String uri = BASE_URI + "/instituto";
		WebTarget target = cliente.target(uri);
		Gson gson = new Gson();
		String jsonIes = gson.toJson(ies);
		Invocation invocation = target.request().buildPost(Entity.entity(jsonIes, MediaType.APPLICATION_JSON));
		Response response = invocation.invoke();
		String body = response.readEntity(String.class);
		final Type tipoIes = new TypeToken<Ies>() {
		}.getType();
		return gson.fromJson(body, tipoIes);
	}
	
	public static IesPaginado getIesPaginado(int pagina) {
		String uri = BASE_URI + "/institutos/" + pagina;
		WebTarget target = cliente.target(uri);
		Invocation invocation = target.request(MediaType.APPLICATION_JSON).buildGet();
		Response response = invocation.invoke();
		String body = response.readEntity(String.class);
		Gson gson = new Gson();
		IesPaginado IesPaginado = gson.fromJson(body, IesPaginado.class);
		return IesPaginado;
	}
	
}
