package com.features.coordenadas;

public class Principal {

	public static void main(String[] args) {
		Ponto pontoA, pontoB;
		pontoA = new Ponto();
		pontoB = new Ponto();
		
		pontoA.AtualizaCoordenadas(4, 3);
		
		pontoB.AtualizaCoordenadas(3, 4);
		
		double distancia = pontoA.Distancia(pontoB);
		
		System.out.printf("A distância entre A e B é: %.2f", distancia);
		
	}
}