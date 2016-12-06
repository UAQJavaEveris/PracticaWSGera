package mx.com.everis.TallerJava.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService

public class Saludos {
	@WebMethod
	public String getSaludo(String nombre){
		return "Hola mundo desde un WS";
	}
	
	public String getSaludoByName(String nombre){
		return "Hola "+nombre;
	}
}
