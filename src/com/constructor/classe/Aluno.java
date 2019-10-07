package com.constructor.classe;

public class Aluno {
	private String nome;
	private String matricula;
	private double[] notas;
	
	Aluno(){
		this.notas = new double[2];
	}
	
	Aluno(int quantidadeNotas){
		this.notas = new double[quantidadeNotas];
	}
	
	public String infoAluno(){
		StringBuilder mensagem = new StringBuilder();
		
		mensagem.append("Nome: " + this.nome);
		mensagem.append("\nMatrícula: " + this.matricula);
		mensagem.append("\nMédia: " + this.getMean());
		
		return mensagem.toString();
		
	}
	
	//Recupera a média do aluno
	public double getMean(){
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			media += notas[i];
		}
		return media/notas.length;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setNota(int conceito, double nota){
		this.notas[conceito] = nota;
	}
	
	public double getNota(int conceito){
		return this.notas[conceito];
	}
	
	public double[] getNotas(){
		return this.notas;
	}
	
}
