package com.features.contadorEventos;

public class ContadorEventos {
	private int contador;
	
	public void zeraContador(){
		contador = 0;
	}
	
	public void incrementar(){
		contador++;
	}
	
	public int getContador(){
		return contador;
	}
	
	public void decrementar(){
		contador--;
	}
	
}
