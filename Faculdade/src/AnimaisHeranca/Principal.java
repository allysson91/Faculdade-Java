package AnimaisHeranca;

import java.awt.Image;
import java.util.Scanner;

public class Principal {

	Scanner scan = new Scanner(System.in);
	Image foto;
	double peso;
	String comida;
	Cachorro cachorro = new Cachorro(foto, peso, comida);

	public void Processar() {
		while (true) {
			System.out.println("1 - Cadastrar cachorro");
			System.out.println("2 - Cadastrar Galinha");
			System.out.println("3 - Cadastrar Coruja");
			System.out.println("9 - sair");
			System.out.println("Digite sua opção");
			int op = scan.nextInt();

			switch (op) {
			case 1:

			
				
				break;

			case 2:

				break;

			case 3:

				break;

			case 9:
				System.exit(0);
				break;

			default:
				break;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void lerDados(Animal animal) {
		
		System.out.println("Digite o peso do animal: ");
		peso=scan.nextDouble();
		animal.setPeso(peso);
		System.out.println("Digite a ração do animal: ");
		comida=scan.next();
		animal.setComida(comida);
		
	}

}
