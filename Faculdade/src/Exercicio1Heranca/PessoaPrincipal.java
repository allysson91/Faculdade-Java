package Exercicio1Heranca;

import java.util.Scanner;

public class PessoaPrincipal {

	public static void main(String[] args) {

		new PessoaPrincipal().melhorarMetodo();

	}

	public void piorMetodo() {
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

	public void melhorarMetodo() {

		Scanner scan = new Scanner(System.in);
		while (true) {

			System.out.println("1 - Pessoa Física");
			System.out.println("2 - Pessoa Juridica");
			System.out.println("9 - Sair");
			System.out.println("Escolha uma opção: ");
			int op = scan.nextInt();
			switch (op) {
			case 1:

				PessoaFisica pessoaFi = new PessoaFisica();
				System.out.println("Informe seu cpf: ");
				pessoaFi.setCpf(scan.next());
				System.out.println("Informe o endereço: ");
				pessoaFi.setEndereco(scan.next());
				System.out.println("Informe o nome: ");
				pessoaFi.setNome(scan.next());
				System.out.println("Informe o rg: ");
				pessoaFi.setRg(scan.next());
				pessoaFi.imprimir();
				break;
			case 2:

				break;

			case 9:
				System.exit(0);

			default:
				System.out.println("Opção invalida");
				break;
			}
		}

	}

}
