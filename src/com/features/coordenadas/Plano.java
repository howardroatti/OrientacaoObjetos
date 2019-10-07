package com.features.coordenadas;

public class Plano {
	private Ponto[] plano;
	private int nElem;

	Plano(int quantidadePontos) {
		this.nElem = 0;
		this.plano = new Ponto[quantidadePontos];
	}

	public int getTamanho() {
		return this.nElem;
	}

	public Ponto getPonto(int posicao) {
		return this.plano[posicao];
	}

	public void setPonto(Ponto ponto) {
		if (nElem + 1 >= this.plano.length) {
			System.out.println("Limite atingido!");
		} else {
			this.plano[nElem] = ponto;
			nElem++;
		}
	}

	public void removePonto(int posicao) {
		if (this.plano[posicao] != null) {
			this.plano[posicao] = null;
			nElem--;
			//Tarefa de casa
			//Movimentar para preencher a posição nula
		}
	}

	public void pesquisarPonto(Ponto busca) {
		if (nElem != 0) {
			for (int i = 0; i < nElem; i++) {
				if(this.plano[i].CoordenadaX() == busca.CoordenadaX() &&
				   this.plano[i].CoordenadaY() == busca.CoordenadaY()){
					System.out.println("Ponto pertence ao plano.");
					break;
				}
			}
		} else {
			System.out.println("Não existem pontos!");
		}
	}

}
