package com.instituto.cliente;

import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

public class ClienteJugadores {

	public static void main(String[] args) {
		try {
			URL url= java.net.URI.create("http://localhost:8080/api/jugador").toURL();
		HttpURLConnection conexion=
				(HttpURLConnection)url.openConnection();
		//Que queremos hacer en el JSON
		conexion.setRequestMethod("GET");
		
		BufferedReader lector = 
				new BufferedReader(new InputStreamReader(conexion.getInputStream()));
		String linea;
		StringBuilder json = new StringBuilder();
		
		while((linea=lector.readLine())!= null) {
			json.append(linea);
		}
		lector.close();
		
		ObjectMapper mapper = new ObjectMapper();
		
		Jugador[] jugadores = mapper.readValue(
				json.toString(), 
				Jugador[].class);
		for(Jugador j:jugadores) 
		{
			System.out.println("ID:" + j.getId() + "Nombre:" + j.getNombre());
		}
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
