package Veiculos;

import java.util.Scanner;

public class PrincipalVeiculo {

	static Veiculo carro = new Carro();
	static Veiculo caminaho = new Caminhao();
	static Veiculo bicicleta = new Bicicleta();

	private static void cadastrarVeiculo(Veiculo veiculo) {

		veiculo.lerDados();

	}

	private static void imprimirVeiculo(Veiculo veiculo) {

		veiculo.imprimir();

	}

	public static void main(String[] args) {
		int op = 0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("\n==========================================");
			System.out.println("| 1 - cadastrar carro:                   |");
			System.out.println("| 2 - cadastrar caminhão:                |");
			System.out.println("| 3 - cadastrar bicicleta:               |");
			System.out.println("| 4 - consultar carro cadastrado:        |");
			System.out.println("| 5 - consultar caminhão cadastrado:     |");
			System.out.println("| 6 - consultar bicicleta cadastrada:    |");
			System.out.println("| 9 - sair:                              |");
			System.out.println("==========================================\n");
			op = scan.nextInt();
			switch (op) {

			case 1:
				cadastrarVeiculo(carro);
				break;

			case 2:
				cadastrarVeiculo(caminaho);
				break;

			case 3:
				cadastrarVeiculo(bicicleta);
				break;

			case 4:
				imprimirVeiculo(carro);
				break;

			case 5:
				imprimirVeiculo(caminaho);
				break;

			case 6:
				imprimirVeiculo(bicicleta);
				break;

			case 9:
				System.out.println("\nAplicação finalizada");
				System.exit(0);
				break;

			default:

				break;
			}

		} while (op != 9);
	}

}
