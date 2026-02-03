package com.miempresa.ServidorTCP;
import java.io.*;
import java.net.*;
public class EsqueletoServidor {

	private static final int PUERTO = 12345;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----SERVIDOR INICIADO----");
		
		try(ServerSocket serverSocket = new ServerSocket(PUERTO))
		{
			while(true) {
				//1.- Esperar Conexion
				System.out.println("Esperando al cliente...");
			Socket socketCliente = serverSocket.accept();
				//2.- Atender petición del cliente
				System.out.println("Cliente conectado:" 
				+ socketCliente.getInetAddress());
			atenderCliente(socketCliente);
			}
			
		}catch(IOException e) {
			//TODO: handle exception
		}
	}
	public static void atenderCliente(Socket socket)
	{
		try (BufferedReader entrada = 
			new BufferedReader(new InputStreamReader(socket.getInputStream())))
		{
			
		}catch(IOException e){
			
		}
	}

}
