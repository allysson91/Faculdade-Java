package Exercicio1Heranca;

public class PessoaFisica extends Pessoa {

	private String rg, cpf;

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void imprimir() {
		System.out.println("RG: " + rg);
		System.out.println("CPF: " + cpf);
		System.out.println("Nome: " + getNome());
		System.out.println("Endereço: " + getEndereco());
	}

}
