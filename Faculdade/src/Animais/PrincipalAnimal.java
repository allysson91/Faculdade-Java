package Animais;

import java.util.Scanner;



public class PrincipalAnimal {

	public static void main(String[] args) {
		int opcao;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("1 - cadastrar ave");
			System.out.println("2 - cadastrar cachorro");
			System.out.println("3 - ler ave cadastrada");
			System.out.println("4 - ler cachorro cadastrado");
			System.out.println("9 - sair");
			System.out.println("Digite uma opção: ");
			opcao = scan.nextInt();
			switch (opcao) {
			case 1:

				Animal ave = new Ave();
				cadastrarAnimal(ave);

				break;

			case 2:

				Animal cachorro = new Cachorro();
				cadastrarAnimal(cachorro);
				break;
				
			case 3:
				
				
				Ave ave2 = new Ave();
				
				ave2.imprimir();
				break;
				
			case 9:
				System.exit(0);

			default:
				break;
			}
		} while (opcao != 9);
		

	}

	private static void cadastrarAnimal(Animal animal) {

		animal.lerDados();
	
		}
	}
	

