package com.testes;

import java.util.ArrayList; // import the ArrayList class
//import java.util.Collections;  // Import the Collections class to Sort

public class TesteArrayList {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList
															// object
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		System.out.println(cars);// Exibe todos os elementos do ArrayList

		System.out.println(cars.get(0));// Recupera um único elemento do
										// ArrayList

		cars.set(0, "Opel");// Altera um elemento específico do ArrayList
		System.out.println(cars.get(0));// Recupera um único elemento do
										// ArrayList

		cars.remove(0);// Remove um elemento específico do ArrayList
		System.out.println(cars);

		// Remove todos os elementos do ArrayList
		/*
		 * cars.clear(); System.out.println(cars);
		 */

		System.out.println(cars.size());// Recupera o tamanho do ArrayList

		// Loop sobre o ArrayList
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}

		//Collections.sort(cars);//Ordena o ArrayList
		//Collections.reverse(cars);//Ordena o ArrayList descending
		
		// Loop sobre o ArrayList com For Each
		for (String i : cars) {
			System.out.println(i);
		}
	}
}