package com.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TesteArrayListDouble {

	public static void main(String[] args) {
		ArrayList<Double> elementos = new ArrayList<Double>();
		Scanner in = new Scanner(System.in);
		
		System.out.print("Quantidade de elementos: ");
		int quantidade = in.nextInt();
		
		for(int i = 0; i < quantidade; i++){
			System.out.print("Informe o "+ (i+1) +"º número: ");
			elementos.add(in.nextDouble());
		}
		
		for(int i = 0; i < quantidade; i++){
			if(i % 2 != 0){
				elementos.remove(i);
			}
		}
		
		Collections.sort(elementos);
		Collections.reverse(elementos);
		
		for (Double elem : elementos) {
			System.out.println(elem);
		}
		
	}

}
