package roupas;

import java.util.Scanner;

public class Calca extends Roupa{
	
	private String tipoBarra;
	private String estilo;
	
	
	
	public Calca(String tipoBarra, String estilo,String marca, String cor, String tamanho, double preco) {
		super(marca, cor, tamanho, preco);
		this.tipoBarra = tipoBarra;
		this.estilo = estilo;	
		
	}
	
	public void lerDados() {
		super.lerDados();
		System.out.println("Informar a barra: ");
		tipoBarra = scan.nextLine();
		System.out.println("Informar o estilo: ");
		estilo = scan.nextLine();
	}
	
	public Calca() {
		super();
	}
	
	public String getTipoBarra() {
		return tipoBarra;
	}
	public void setTipoBarra(String tipoBarra) {
		this.tipoBarra = tipoBarra;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

}
