package com.briefing.collections;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveNumerosImpares {

	public static void main(String[] args) {
		ArrayList<Double> lista = new ArrayList<Double>();
		Scanner in = new Scanner(System.in);
		
		System.out.print("Quantos elementos deseja cadastrar? ");
		int quantidade = in.nextInt();
		
		for(int i = 0; i < quantidade; i++) {
			lista.add(in.nextDouble());
		}
		
		for(int i = 0; i < quantidade; i++) {
			if(i % 2 != 0) {
				lista.remove(i);
			}
		}
		
		for (Double numeros : lista) {
			System.out.println(numeros);
		}
		
	}
}