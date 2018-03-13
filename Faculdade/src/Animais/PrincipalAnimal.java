package Animais;

import java.util.Scanner;



public class PrincipalAnimal {
	static Animal ave = new Ave();
	static	Animal cachorro = new Cachorro();
	

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

				
				cadastrarAnimal(ave);

				break;

			case 2:

			
				cadastrarAnimal(cachorro);
				break;
				
			case 3:
				
				imprimirAnimal(ave);
				break;
				
			case 4:
				
				imprimirAnimal(cachorro);
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
	private static void imprimirAnimal(Animal animal) {

		animal.imprimir();
	
		}
	
	}
	

