package roupas;

import java.util.Scanner;

public abstract class Roupa {

	private String marca, cor, tamanho;
	private double preco;
	Scanner scan = new Scanner(System.in);

	public Roupa() {
		
	}

	public Roupa(String marca, String cor, String tamanho, double preco) {
		this.marca = marca;
		this.cor = cor;
		this.tamanho = tamanho;
		this.preco = preco;
	}
	
	public void lerDados() {
	
		Scanner scan = new Scanner(System.in);
		String marca, cor, tamanho;
		double preco;
		System.out.println("Informar a marca: ");
		marca = scan.nextLine();
		System.out.println("Informar a cor: ");
		cor = scan.nextLine();
		System.out.println("Informe o tamanho: ");
		tamanho = scan.nextLine();
		System.out.println("Informe o preco: ");
		preco = scan.nextDouble();
		
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
