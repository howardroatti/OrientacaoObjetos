package com.features.circunferencia;

public class Circulo {
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double areaCircunferencia(){
		return Math.PI * raio * raio;
	}
	
	public double comprimentoCircunferencia(){
		return 2 * Math.PI * raio;
	}
	
}
