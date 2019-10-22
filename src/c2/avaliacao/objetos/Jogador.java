package c2.avaliacao.objetos;

public class Jogador {
	private String nome;
	private int idade;
	private Posicao posicao;
	private boolean titular;
	
	Jogador(){}
	
	public Jogador(String nome, int idade, Posicao posicao, boolean titular){
		this.nome = nome;
		this.idade = idade;
		this.posicao = posicao;
		this.titular = titular;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}

	public boolean isTitular() {
		return titular;
	}

	public void setTitular(boolean titular) {
		this.titular = titular;
	}

	public String toString(){
		StringBuilder mensagem = new StringBuilder();
		
		mensagem.append("Nome: " + this.nome);		
		mensagem.append("\nIdade: " + this.idade);
		mensagem.append("\nPosicao: " + this.posicao.name());
		
		if(this.titular){
			mensagem.append("\nTitular: Sim");
		}else{
			mensagem.append("\nTitular: Não");
		}
		
		return mensagem.toString();
	}
	
}
