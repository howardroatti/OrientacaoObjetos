package com.constructor.coordenadas;

public class Principal {

	public static void main(String[] args) {
		Ponto pontoA =  new Ponto();
		Ponto pontoB = new Ponto(3,2);
		
		System.out.println("A distância entre A e B é: " + pontoA.distance(pontoB));
		
	}

}
