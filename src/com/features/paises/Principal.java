package com.features.paises;

public class Principal {

	public static void main(String[] args) {
		Pais brasil = new Pais();
		
		brasil.setIso("3166-1");
		brasil.setNome("Brasil");
		brasil.setPopupalacao(209300000);
		brasil.setDimensao(8515767);
		
		Pais[] vizinhos = new Pais[10];
		String nomesVizinhos[] = {"Uruguai", "Colombia", "Argentina",
				                  "Bolivia", "Guiana", "Suriname",
				                  "Guiana Francesa", "Venezuela",
				                  "Paraguai", "Peru"};
		
		for (int i = 0; i < vizinhos.length; i++) {
			vizinhos[i] = new Pais();
			vizinhos[i].setNome(nomesVizinhos[i]);
		}
		
		brasil.setVizinhos(vizinhos);
		
		System.out.println(brasil.toString());
		
	}

}
