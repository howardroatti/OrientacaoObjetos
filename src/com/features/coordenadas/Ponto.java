package com.features.coordenadas;

public class Ponto {
	private double x;
	private double y;
	
	public double CoordenadaX(){
		return x;
	}
	
	public double CoordenadaY(){
		return y;
	}
	
	public double Distancia(Ponto ponto){
		//RaizQuadrada( Potência(x2 - x1)^2 + Potência(y2 - y1)^2 ) 
		double resultado = Math.sqrt(Math.pow((ponto.CoordenadaX() - x), 2) + Math.pow((ponto.CoordenadaY() - y),2));
		
		return resultado;
	}
	
	public void AtualizaCoordenadas(double novoX, double novoY){
		x = novoX;
		y = novoY;
	}
	
}
