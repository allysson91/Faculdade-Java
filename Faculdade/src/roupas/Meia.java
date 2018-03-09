package roupas;

import java.util.Scanner;

public class Meia extends Roupa {

	private double tpCano;

	public Meia(Double tpCano, String marca, String cor, String tamanho, double preco) {
		super(marca, cor, tamanho, preco);
		this.tpCano = tpCano;
	}

	public void lerDados() {
		super.lerDados();
		System.out.println("Informar o tipo de cano: ");
		tpCano=scan.nextDouble();
		
	}
	
	public Meia() {
		super();
		// TODO Auto-generated constructor stub
	}


	public double getTpCano() {
		return tpCano;
	}

	public void setTpCano(double tpCano) {
		this.tpCano = tpCano;
	}
	
	
}
