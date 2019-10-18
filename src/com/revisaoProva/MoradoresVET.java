package revisaoProva;

public class MoradoresVET {
	private Moradores[] moradores;
	private int nElem;

	MoradoresVET() {
		this.nElem = 0;
		this.moradores = new Moradores[5000];
	}

	public int getTamanho() {
		return this.nElem;
	}

	public Moradores getMorador(int posicao) {
		return this.moradores[posicao];
	}

	public Moradores[] getMoradores() {
		return this.moradores;
	}

	public void setMorador(Moradores morador) {
		/*
		 * Se, supondo que fosse adicionada uma unidade na quantidade de
		 * elementos, e essa quantidade fosse superior ao tamanho estabelecido
		 * para o vetor no construtor do objeto.
		 */
		if (nElem + 1 >= this.moradores.length) {
			System.out.println("Limite atingido!");
		} else {
			/*
			 * Caso contrário, insere o objeto no vetor de objetos e incrementa
			 * a variável que determina a quantidade de elementos do vetor
			 */
			this.moradores[nElem] = morador;
			nElem++;
		}
	}

	public void removeMorador(int posicao) {
		if (this.moradores[posicao] != null) {
			this.moradores[posicao] = null;
			nElem--;

			for (int i = posicao; i < this.moradores.length - 1; i++) {
				if (this.moradores[i + 1] != null)
					this.moradores[i] = this.moradores[i + 1];
			}
		}
	}

	public Moradores pesquisarMorador(String CPF) {
		if (nElem != 0) {
			for (int i = 0; i < nElem; i++) {
				if (this.moradores[i].getCPF().equals(CPF)) {
					return this.moradores[i];
				}
			}
		} else {
			System.out.println("Não existem Moradores!");
		}
		return null;
	}

}
