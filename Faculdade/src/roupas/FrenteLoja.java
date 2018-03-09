package roupas;

import java.util.Scanner;

public class FrenteLoja {

	public static void main(String[] args) {
		int opcao;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("1 - cadastrar camisa");
			System.out.println("2 - cadastrar calca");
			System.out.println("3 - cadastrar meia");
			System.out.println("Digite uma opção: ");
			opcao = scan.nextInt();
			switch (opcao) {
			case 1:

				Roupa camisa = new Camisa();
				cadastrarRoupa(camisa);

				break;

			case 2:

				Roupa calca = new Calca();
				cadastrarRoupa(calca);

				break;
			case 3:

				Roupa meia = new Meia();
				cadastrarRoupa(meia);
				break;
				
			case 9:
				System.exit(0);

			default:
				break;
			}
		} while (opcao != 9);
		

	}

	private static void cadastrarRoupa(Roupa roupa) {

		roupa.lerDados();
	
		}
		
	}
