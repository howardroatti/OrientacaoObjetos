package com.constructor.coordenadas;

public class Ponto {
	private double x;
	private double y;

	Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	Ponto() {
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double distance(Ponto ponto) {
		return Math.sqrt(Math.pow((ponto.getX() - this.x), 2)+Math.pow((ponto.getY() - this.y), 2));
	}
	
}
