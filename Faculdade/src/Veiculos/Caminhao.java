package Veiculos;

public class Caminhao extends Veiculo {
	
	private double pesoSuportado;

	public Caminhao(String chassi, String fabricante, String modelo, double pesoSuportado) {
		super(chassi, fabricante, modelo);
		this.pesoSuportado = pesoSuportado;
	}

	public void lerDados() {
		
		super.lerDados();
		System.out.println("Peso suportado: ");
		setPesoSuportado(scan.nextDouble());
		
	}
	
	public void imprimir() {
		
		super.imprimir();
		System.out.println("Peso suportado: "+getPesoSuportado());
		
	}
	
	public Caminhao() {
		super();
	}

	public double getPesoSuportado() {
		return pesoSuportado;
	}

	public void setPesoSuportado(double pesoSuportado) {
		this.pesoSuportado = pesoSuportado;
	}

	@Override
	public String toString() {
		return "Caminhao [pesoSuportado=" + pesoSuportado + ", getPesoSuportado()=" + getPesoSuportado()
				+ ", getChassi()=" + getChassi() + ", getFabricante()=" + getFabricante() + ", getModelo()="
				+ getModelo() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}



}
