package c2.avaliacao.principal;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import c2.avaliacao.objetos.Time;
import c2.avaliacao.objetos.Jogador;
import c2.avaliacao.objetos.Posicao;

public class Principal {
	
	public static Time time;
	public static JFrame frame = new JFrame("");
	
	public static void main(String[] args) {
		int opcao;
		time = new Time(22, "São Paulo");

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(frame, 
					"\n1 - Cadastrar Jogador"
			      + "\n2 - Substituir Jogador"
				  + "\n3 - Exibir Time Titular"
				  + "\n4 - Exibir Time Completo"
				  + "\n0 - Sair"));

			switch (opcao) {
			case 1:
				CadastrarJogador();
				break;
			case 2:
				SubstituirJogador();
				break;
			case 3:
				JogadoresTitulares();
				break;
			case 4:
				JOptionPane.showMessageDialog(frame, time.toString());
			case 0:
				JOptionPane.showMessageDialog(frame, "Saindo...");
				break;
			default:
				JOptionPane.showMessageDialog(frame, "Opção inválida!");
				break;
			}

		} while (opcao != 0);

	}

	public static void CadastrarJogador() {
		String nome;
		int idade, pos;
		Posicao posicao;
		boolean titular;		
		
		nome  = JOptionPane.showInputDialog(frame, "Nome");
		idade  = Integer.parseInt(JOptionPane.showInputDialog(frame, "Idade"));
		
		pos = Integer.parseInt(JOptionPane.showInputDialog(frame, 
				"Posição"
			  + "\n0 - Goleiro"
		      + "\n1 - Lateral"
			  + "\n2 - Zagueiro"
			  + "\n3 - Meia"
			  + "\n4 - Volante"
			  + "\n5 - Meia Atacante"
			  + "\n6 - Meia Armador"
			  + "\n7 - Atacante"
			  + "\n8 - Centro Avante"
			  + "\n9 - Ponta"));
		
		posicao = recuperaPosicao(pos);
		
		titular = Integer.parseInt(JOptionPane.showInputDialog(frame, "Titular\n1 - Sim\n2 - Não")) == 1;
		
		Jogador jogador = new Jogador(nome, idade, posicao, titular);
		
		time.setJogador(jogador);
	}

	public static Posicao recuperaPosicao(int pos){
		switch (pos) {
		case 0:
			return Posicao.GOLEIRO;
		case 1:
			return Posicao.LATERAL;
		case 2:
			return Posicao.ZAGUEIRO;
		case 3:
			return Posicao.MEIA;
		case 4:
			return Posicao.VOLANTE;
		case 5:
			return Posicao.MEIA_ATACANTE;
		case 6:
			return Posicao.MEIA_ARMADOR;
		case 7:
			return Posicao.ATACANTE;
		case 8:
			return Posicao.CENTRO_AVANTE;
		case 9:
			return Posicao.PONTA;
		default:
			return Posicao.NENHUMA;
		}
	}
	
	public static void SubstituirJogador() {
		String nomeJogadorSai = JOptionPane.showInputDialog(frame, "Jogador que sai: ");
		Jogador jogadorSai = time.pesquisarJogador(nomeJogadorSai);
		
		String nomeJogadorEntra = JOptionPane.showInputDialog(frame, "Jogador que entra: ");
		Jogador jogadorEntra = time.pesquisarJogador(nomeJogadorEntra);
		
		jogadorSai.setTitular(false);
		jogadorEntra.setTitular(true);
		
	}

	public static void JogadoresTitulares() {
		StringBuilder jogadoresTitulares = new StringBuilder();
		for (int i = 0; i < time.getTamanho(); i++) {			
			if(time.getJogador(i).isTitular()){
				jogadoresTitulares.append("\n" + time.getJogador(i).toString());
			}
		}
		JOptionPane.showMessageDialog(frame, "Titulares" + jogadoresTitulares.toString());
	}
}
