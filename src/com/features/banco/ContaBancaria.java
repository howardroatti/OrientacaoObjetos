package com.features.banco;

public class ContaBancaria {
	private double saldo;
	
	public void Depositar(double valor){
		saldo += valor;
	}
	
	public void Sacar(double valor){
		if(valor < saldo){
			saldo -= valor;	
		}else{
			System.err.println("Voc� n�o possui saldo para esse saque...");
		}		
	}
	
	public double VerificarSaldo(){
		return saldo;
	}
	
}
