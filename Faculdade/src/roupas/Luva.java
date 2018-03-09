package roupas;

public class Luva extends Roupa{

private boolean dedo;




public Luva(boolean dedo, String marca, String cor, String tamanho, double preco) {
	super(marca, cor, tamanho, preco);
	this.dedo = dedo;
}

public void lerDados() {
	System.out.println("Iforme com dedo ou sem: ");
	scan.nextBoolean();
}

public Luva() {
	super();
	// TODO Auto-generated constructor stub
}

public boolean isDedo() {
	return dedo;
}

public void setDedo(boolean dedo) {
	this.dedo = dedo;
}


	
}
