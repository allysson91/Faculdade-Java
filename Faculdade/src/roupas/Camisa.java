package roupas;

import java.util.Scanner;

public class Camisa  extends Roupa{
	
	private String tpGola;
	private boolean estampada;
	
	public Camisa(String tpGola, boolean estampada, String marca, String cor, String tamanho, double preco) {
		super(marca, cor, tamanho, preco);
		this.tpGola = tpGola;
		this.estampada = estampada;
	}
	
	public void lerDados() {
		super.lerDados();
		System.out.println("Informar o tipo da gola: ");
		tpGola = scan.nextLine();
		System.out.println("Informar se é estampada: ");
		estampada = scan.nextBoolean();
		
		
	}
	
	public Camisa() {
		super();
	}
	
	public String getTpGola() {
		return tpGola;
	}
	
	public void setTpGola(String tpGola) {
		this.tpGola = tpGola;
	}
	
	public boolean isEstampada() {
		return estampada;
	}
	
	public void setEstampada(boolean estampada) {
		this.estampada = estampada;
	}

}
