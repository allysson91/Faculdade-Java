package Exercicio1Heranca;

public class PessoaJuridica extends Pessoa {

	private String cnpj, razaoSocial;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void imprimir() {

		System.out.println("CNPJ: " + cnpj);
		System.out.println("Razão Social" + razaoSocial);
		System.out.println("Nome: " + getNome());
		System.out.println("Endereço: " + getEndereco());

	}

}
