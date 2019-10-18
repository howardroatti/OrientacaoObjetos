package revisaoProva;

public class Moradores {
	private String CPF;
	private double peso;
	private char sexo;
	
	public Moradores(){}
	
	public Moradores(String CPF, double peso, char sexo) {		
		this.CPF = CPF;
		this.peso = peso;
		this.sexo = sexo;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Moradores [CPF=" + CPF + ", peso=" + peso + ", sexo=" + sexo + "]";
	}
	
}
