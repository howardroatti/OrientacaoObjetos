package com.features.banco;

public class Principal {

	public static void main(String[] args) {
		ContaBancaria contaCorrente = new ContaBancaria();
		
		contaCorrente.Depositar(100);
		
		System.out.println("Saldo atual: " + contaCorrente.VerificarSaldo());
		
		contaCorrente.Sacar(200);
		
		System.out.println("Saldo atual: " + contaCorrente.VerificarSaldo());
		
	}

}
