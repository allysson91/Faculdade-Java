package Exercicio2Heranca;

import java.util.Scanner;

public class Principal {

	Scanner scan = new Scanner(System.in);
	String chassi;
	String fabricante;
	String modelo;
	Carro car = new Carro();
	Caminhao caminhao = new Caminhao();

	public static void main(String[] args) {

		new Principal().processar();

	}

	public void processar() {
		int qdadeVolumes;
		while (true) {
			System.out.println("1 - Cadastrar carro");
			System.out.println("2 - Cadastrar Caminhao");
			System.out.println("9 - sair");
			System.out.println("Digite sua opção");
			int op = scan.nextInt();

			switch (op) {
			case 1:

				lerDados(car);
				System.out.println("Digite a quantidade de volumes: ");
				qdadeVolumes = scan.nextInt();
				car.setQdadeVolumes(qdadeVolumes);
				System.out.println(car);

				break;

			case 2:

				lerDados(caminhao);
				System.out.println("Digite a quantidade de peso: ");
				double peso = scan.nextDouble();
				caminhao.setPesoSuportado(peso);
				System.out.println(caminhao);

				break;

			case 9:
				System.exit(0);
				break;

			default:
				break;
			}
		}

	}

	public void lerDados(Veiculo v) {

		System.out.println("Digite o chassi: ");
		chassi = scan.next();
		v.setChassi(chassi);
		System.out.println("Digite o modelo: ");
		modelo = scan.next();
		v.setModelo(modelo);
		System.out.println("Digite o fabricante: ");
		fabricante = scan.next();
		v.setFabricante(fabricante);

	}

}
