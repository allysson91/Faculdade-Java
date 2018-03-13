package Animais;

import java.util.Scanner;

public abstract class Animal {

	private String nome;
	private String dataNascimento;
	private String cor;
	Scanner scan = new Scanner(System.in);
	
	public Animal() {
	
	}
	
	public Animal(String nome, String dataNascimento, String cor) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cor = cor;
	}
	
	public void imprimir() {
		
		System.out.println("nome: "+getNome());
		System.out.println("Data nascimento: "+getDataNascimento());
		System.out.println("Cor: "+getCor());
		
	}
	
	public void lerDados() {
		
		System.out.println("Informar o nome: ");
		nome = scan.nextLine();
		System.out.println("Informar a data de nascimento: ");
		dataNascimento = scan.nextLine();
		System.out.println("Informe a cor: ");
		cor = scan.nextLine();
	
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", dataNascimento=" + dataNascimento + ", cor=" + cor + ", scan=" + scan + "]";
	}
	
	
	
}
