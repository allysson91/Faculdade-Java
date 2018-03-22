package InterfaceDVD;

import java.util.Scanner;

public class FrenteLoja {

	

	public static void main(String[] args) {
		new FrenteLoja().processar();

	}

	private void processar() {
		int op = 0;
		Scanner scan = new Scanner(System.in);
		EstruturaDVD meuDVD = new EstruturaDVD();
		RegrasDVD regrasNegocio = new RegrasDVD();
		
		do {
			
			System.out.println("\n======================");
			System.out.println("| 1 - Criar DVD:     |");
			System.out.println("| 2 - Listar DVD:    |");
			System.out.println("| 3 - Sair           |");
			System.out.println("======================");
			op = scan.nextInt();
		
			switch (op) {
			case 1:
				System.out.print("Informar nome do DVD:\n");
				String nome = scan.next();
				System.out.println("Informar o preço: ");
				double preco = scan.nextDouble();
				meuDVD = new EstruturaDVD(preco, nome);
				regrasNegocio.adicionarDVD(meuDVD);
				
				break;

			case 2:
				regrasNegocio.imprimirEstoque();
				
				break;

			case 3:
				System.out.println("Aplicação finalizada!");
				System.exit(0);
				
				break;

			}
			
		}while(op!=3);
		
	}

}
