package c2.avaliacao.objetos;

public class Time {
	private Jogador[] jogadores;
	private int nElem;
	private String nome;

	public Time() {
	}

	public Time(int quantidade, String nome) {
		this.jogadores = new Jogador[quantidade];
		this.nElem = 0;
		this.nome = nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public int getTamanho() {
		return this.nElem;
	}

	public Jogador getJogador(int posicao) {
		return this.jogadores[posicao];
	}

	public Jogador[] getJogadores() {
		return this.jogadores;
	}

	public void setJogador(Jogador Jogador) {
		/*
		 * Se, supondo que fosse adicionada uma unidade na quantidade de
		 * elementos, e essa quantidade fosse superior ao tamanho estabelecido
		 * para o vetor no construtor do objeto.
		 */
		if (nElem + 1 >= this.jogadores.length) {
			System.out.println("Limite atingido!");
		} else {
			/*
			 * Caso contrário, insere o objeto no vetor de objetos e incrementa
			 * a variável que determina a quantidade de elementos do vetor
			 */
			this.jogadores[nElem] = Jogador;
			nElem++;
		}
	}

	public void expulsarJogador(int posicao) {
		if (this.jogadores[posicao] != null) {
			this.jogadores[posicao] = null;
			nElem--;

			for (int i = posicao; i < this.jogadores.length - 1; i++) {
				if (this.jogadores[i + 1] != null)
					this.jogadores[i] = this.jogadores[i + 1];
			}
		}
	}

	public Jogador pesquisarJogador(String nome) {
		if (nElem != 0) {
			for (int i = 0; i < nElem; i++) {
				if (this.jogadores[i].getNome().equals(nome)) {
					return this.jogadores[i];
				}
			}
		} else {
			System.out.println("Não existem Jogadores!");
		}
		return null;
	}

	public String toString() {
		StringBuilder mensagem = new StringBuilder();

		mensagem.append("Time: " + this.nome + "\n===Jogadores===");
		for (int i = 0; i < nElem; i++) {
			mensagem.append("\n" + this.getJogador(i).toString());
		}

		return mensagem.toString();
	}

}
