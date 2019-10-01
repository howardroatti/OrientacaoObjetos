package com.features.mundo;

import com.features.paises.Pais;

public class Continentes {
	private Pais[] paises;
	private String nome;
	
	public void setPaises(Pais[] paises){
		this.paises = paises;
	}
	
	public void setPais(Pais pais){
		Pais[] temp;
		
		if(paises.length == 0){
			paises = new Pais[1];
			paises[0] = pais;
		}else{
			temp = new Pais[paises.length + 1];
			
			for (int i = 0; i < paises.length; i++) {
				temp[i] = paises[i];
			}
			
			temp[temp.length - 1] = pais;
			
			paises = temp;
		}
	}

	public double dimensaoContinente(){
		double dimensao = 0;
		for (int i = 0; i < paises.length; i++) {
			dimensao += paises[i].getDimensao();
		}
		
		return dimensao;
	}
	
	public int populacaoContinente(){
		int populacao = 0;
		for (int i = 0; i < paises.length; i++) {
			populacao += paises[i].getPopulacao();
		}
		
		return populacao;
	}
	
	public double densidadePopulacional(){
		return populacaoContinente() / dimensaoContinente();
	}
	
	public Pais maiorPopulacao(){
		Pais paisMaiorPopulacao = null;
		int maior = Integer.MIN_VALUE;
		
		for (int i = 0; i < paises.length; i++) {
			if(paises[i].getPopulacao() > maior){
				paisMaiorPopulacao = paises[i];
				maior = paises[i].getPopulacao();
			}
		}
		
		return paisMaiorPopulacao;
	}
	
	public Pais menorPopulacao(){
		Pais paisMenorPopulacao = null;
		int menor = Integer.MAX_VALUE;
		
		for (int i = 0; i < paises.length; i++) {
			if(paises[i].getPopulacao() < menor){
				paisMenorPopulacao = paises[i];
				menor = paises[i].getPopulacao();
			}
		}
		
		return paisMenorPopulacao;
	}
	
	public Pais maiorDimensao(){
		Pais paisMaiorDimensao = null;
		double maior = Double.MIN_VALUE;
		
		for (int i = 0; i < paises.length; i++) {
			if(paises[i].getDimensao() > maior){
				paisMaiorDimensao = paises[i];
				maior = paises[i].getDimensao();
			}
		}
		
		return paisMaiorDimensao;
	}
	
	public Pais menorDimensao(){
		Pais paisMenorDimensao = null;
		double menor = Double.MAX_VALUE;
		
		for (int i = 0; i < paises.length; i++) {
			if(paises[i].getDimensao() < menor){
				paisMenorDimensao = paises[i];
				menor = paises[i].getDimensao();
			}
		}
		
		return paisMenorDimensao;
	}
	
	public double razaoTerritorial(){
		return maiorDimensao().getDimensao() / menorDimensao().getDimensao();
	}
	
}
