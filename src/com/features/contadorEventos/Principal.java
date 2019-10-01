package com.features.contadorEventos;

public class Principal {

	public static void main(String[] args) {
		ContadorEventos contador = new ContadorEventos();
		
		contador.zeraContador();
		
		System.out.println(contador.getContador());
		
		contador.incrementar();
		contador.incrementar();
		
		System.out.println(contador.getContador());
		
		contador.decrementar();
		
		System.out.println(contador.getContador());
		
	}

}
