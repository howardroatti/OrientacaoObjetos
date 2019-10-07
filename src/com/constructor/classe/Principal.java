package com.constructor.classe;

public class Principal {

	public static void main(String[] args) {
		Aluno alunoJoao = new Aluno(3);
		
		alunoJoao.setNome("João");
		alunoJoao.setMatricula("19392919");
		//C1 - Álgebra
		alunoJoao.setNota(0, 10.0);
		
		//C2 - Álgebra
		alunoJoao.setNota(1, 8.5);
		
		//C3 - Álgebra
		alunoJoao.setNota(2, 7.0);
		
		System.out.println(alunoJoao.infoAluno());
		
		//Recupera as notas
		for (int i = 0; i < alunoJoao.getNotas().length; i++) {
			System.out.println(alunoJoao.getNotas()[i]);
		}
		
	}
}