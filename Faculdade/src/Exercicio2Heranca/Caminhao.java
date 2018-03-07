package Exercicio2Heranca;

public class Caminhao extends Veiculo{
	
	private double pesoSuportado;



	public double getPesoSuportado() {
		return pesoSuportado;
	}

	public void setPesoSuportado(double pesoSuportado) {
		this.pesoSuportado = pesoSuportado;
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Caminhao [pesoSuportado=" + pesoSuportado + "]";
	}
	
}
