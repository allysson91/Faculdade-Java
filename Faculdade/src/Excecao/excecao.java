package Excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excecao {


	public static void main(String[] args)  {

		try {
			Scanner leia = new Scanner(System.in);
			System.out.println("Digite uma idade: ");
			int idade = leia.nextInt();
			excecao obj = new excecao();
			//new excecao().avaliarIdadeTSE(idade);
			try {
				obj.avaliarIdadeTSE(idade);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				obj.avaliarDetran(idade);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				obj.avaliarCasamento(idade);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
			
		} catch (InputMismatchException e) {
			System.out.println("Dado de entrada inválida");
		}
		 catch (Exception e) {
			System.out.println("Mensagem:" + e.getMessage());
		}

	}

	public void avaliarIdadeTSE(int idade) throws Exception {

			
			if (idade > 16) {
				throw new Exception("Pode votar");
			} else {
				throw new Exception("Não pode votar");
			}

	}

	private int avaliarDetran(int idade) throws Exception {
		
		if (idade < 18) {
			throw new Exception("Não pode dirigir");
		}
		throw new Exception("Pode dirigir");
	}

	

	private int avaliarCasamento(int idade) throws Exception {
		if (idade < 21) {
			throw new Exception("Não pode casar");
		}
		throw new Exception("Pode casar");
	}

}
