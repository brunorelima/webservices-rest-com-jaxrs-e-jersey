package br.com.alura.loja;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Servidor {

	private static HttpServer server;
	
	public static void startaServidor(){
		URI uri = URI.create("http://localhost:8080/");
		ResourceConfig config = new ResourceConfig().packages("br.com.alura.loja");
		server = GrizzlyHttpServerFactory.createHttpServer(uri, config);
	}
	
	public static void paraServidor(){
		server.stop();
	}
	
	public static void main(String[] args) throws IOException {
		

//		System.out.println("Servidor rodando");
//		System.in.read();
//		server.stop();

	}
}
