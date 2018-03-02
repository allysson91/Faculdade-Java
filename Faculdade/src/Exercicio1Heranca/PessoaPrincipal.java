package Exercicio1Heranca;

public class PessoaPrincipal {

	public static void main(String[] args) {

		try {

			PessoaFisica pessoaFi = new PessoaFisica();
			pessoaFi.setCpf("1234567");
			pessoaFi.setEndereco("R. bananas, 222");
			pessoaFi.setNome("Jouglas");
			pessoaFi.setRg("4321");
			pessoaFi.imprimir();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			PessoaFisica pessoaFi2 = new PessoaFisica();
			pessoaFi2.setCpf("3456789");
			pessoaFi2.setEndereco("R. Pera");
			pessoaFi2.setNome("Oliveira");
			pessoaFi2.setRg("1234");
			pessoaFi2.imprimir();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
