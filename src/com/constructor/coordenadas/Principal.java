package com.constructor.coordenadas;

public class Principal {

	public static void main(String[] args) {
		Ponto pontoA =  new Ponto();
		Ponto pontoB = new Ponto(3,2);
		
		System.out.println("A dist�ncia entre A e B �: " + pontoA.distance(pontoB));
		
	}

}
