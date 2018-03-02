package Exercicio1Heranca;

public class Pessoa {

	private String nome, endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if (endereco.length() <= 10) {
			this.endereco = endereco;
		} else {

			throw new IllegalArgumentException("Endereço supera o limite");

		}
	}

}
