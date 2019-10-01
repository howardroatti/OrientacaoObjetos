package com.features.paises;

public class Pais {
	private String iso;
	private String nome;
	private int popupalacao;
	private double dimensao;
	private Pais[] vizinhos;
	
	public String getIso() {
		return iso;
	}
	
	public void setIso(String iso) {
		this.iso = iso;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getPopulacao() {
		return popupalacao;
	}
	
	public void setPopupalacao(int popupalacao) {
		this.popupalacao = popupalacao;
	}
	
	public double getDimensao() {
		return dimensao;
	}
	
	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}
	
	public void setVizinhos(Pais[] vizinhos) {
		this.vizinhos = vizinhos;
	}
	
	public String getVizinhos(){
		StringBuilder vizinhanca = new StringBuilder();
		
		for (int i = 0; i < vizinhos.length; i++) {			
			if(i < vizinhos.length - 1){
				vizinhanca.append(vizinhos[i].nome + ", ");
			}else{
				vizinhanca.append(vizinhos[i].nome );
			}
		}
		
		return vizinhanca.toString();
	}
	
	public String toString(){
		StringBuilder texto = new StringBuilder();
		
		texto.append("ISO :" + this.getIso() + "\n").
		      append("Nome: " + this.getNome() + "\n").
		      append("População: " + this.getPopulacao() + "\n").
		      append("Dimensão: " + this.getDimensao() + "\n").
		      append("Vizinhos: " + this.getVizinhos());
		
		return texto.toString();
	}
	
}
