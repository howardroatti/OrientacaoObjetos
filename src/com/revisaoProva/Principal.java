package revisaoProva;

import java.util.Scanner;

public class Principal {

	public static MoradoresVET cidade;
	
	public static void main(String[] args) {
		int opcao;
		Scanner in = new Scanner(System.in);
		cidade = new MoradoresVET();

		do {
			System.out.println("1 - Cadastrar Morador");
			System.out.println("2 - Alterar Peso");
			System.out.println("3 - Quant. Moradores > 100Kg");
			System.out.println("0 - Sair");
			opcao = in.nextInt();

			switch (opcao) {
			case 1:
				CadastrarMorador();
				break;
			case 2:
				AlterarPeso();
				break;
			case 3:
				MradoresAcimadoPeso();
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (opcao != 0);

	}

	public static void CadastrarMorador() {
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		
		Moradores morador = new Moradores();
		System.out.print("CPF: ");
		morador.setCPF(in.nextLine());
		
		System.out.print("Peso: ");
		morador.setPeso(in.nextDouble());
		
		System.out.print("Sexo: ");
		morador.setSexo(in2.nextLine().charAt(0));
		
		cidade.setMorador(morador);
	}

	public static void AlterarPeso() {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe um CPF: ");
		String buscaCPF = in.nextLine();
		
		Moradores morador = cidade.pesquisarMorador(buscaCPF);
		
		if(morador != null){
			System.out.print("Informe um novo peso: ");
			morador.setPeso(in.nextDouble());
		}else{
			System.out.println("Morador não encontrado.");
		}
		
	}

	public static void MradoresAcimadoPeso() {
		int quantidade = 0;
		for (int i = 0; i < cidade.getTamanho(); i++) {			
			if(cidade.getMorador(i).getPeso() > 100){
				quantidade++;
			}
		}
		System.out.println("Na cidade existem " + quantidade + " moradores acima de 100Kg.");
	}

}
