package com.heranca.animais;

public class Animal {
	private String nome;
	private boolean acordado;
	
	public void acordar(){
		this.acordado = true;
	}
	
	public void dormir(){
		this.acordado = false;
	}
	
	public void comer(){
		System.out.println("Comendo...");
	}
	
}
