package Exercicio2Heranca;

public class Veiculo {
	
	private String chassi, fabricante, modelo;

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Veiculo [chassi=" + chassi + ", fabricante=" + fabricante + ", modelo=" + modelo + "]";
	}
	
	

}
