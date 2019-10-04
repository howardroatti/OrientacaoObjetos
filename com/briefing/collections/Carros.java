package com.briefing.collections;

import java.util.ArrayList;// import the ArrayList class
import java.util.Collections;

public class Carros {

	public static void main(String[] args) {
		ArrayList<String> carros = new ArrayList<String>();// Cria um objeto do tipo ArrayList

		carros.add("Volvo");
		carros.add("BMW");
		carros.add("Ford");
		carros.add("Mazda");
		carros.add("Ferrari");
		carros.add("Mercedes");
		carros.add("Toyota");
		carros.add("Hyundai");
		carros.add("Honda");

		System.out.println(carros);// Exibe todos os veículos do ArrayList

		System.out.println(carros.get(0));// Recupera um elemento específico do ArrayList
		System.out.println(carros.get(3));// Recupera um elemento específico do ArrayList

		// Troca os carros 0 e 3
		String temp = carros.get(0);
		carros.set(0, carros.get(3));// Altera os dados do ArrayList no indice 0
		carros.set(3, temp);// Altera os dados do ArrayList no indice 3

		System.out.println("\n===Lista de Elementos Após Trocar o 0 pelo 3===");
		System.out.println(carros);// Exibe todos os veículos do ArrayList

		carros.remove(3);// Remove um item especificado pelo índice
		System.out.println("\n===Lista de Elementos Após Remover o Índice 3===");
		System.out.println(carros);// Exibe todos os veículos do ArrayList

		// carros.clear();//Remove todos os elementos do ArrayList
		// carros.removeAll(carros);//Remove todos os elementos do ArrayList

		// System.out.println(carros);//Exibe todos os veículos do ArrayList

		System.out.println("\nQuantidade de elementos no ArrayList: " + carros.size());// Recupera o tamanho do ArrayList

		
		System.out.println("\n===Exibe===");
		for (int i = 0; i < carros.size(); i++) {// Exibe todos os elementos do ArrayList percorrendo item a item
			if (i < carros.size() - 1) {
				System.out.print(carros.get(i) + ",");
			}else {
				System.out.print(carros.get(i));
			}
		}

		System.out.println();
		
		System.out.println("\n===Ordena===");
		Collections.sort(carros);// Ordena a coleção de carros em ordem crescente
		for (String i : carros) {
			System.out.print(i + " ");
		}

		System.out.println();

		System.out.println("\n===Inverte a Ordem===");		
		Collections.reverse(carros);// Inverte a ordem dos carros da coleção
		for (String i : carros) {
			System.out.print(i + " ");
		}

	}

}
