package Veiculos;

public class Carro extends Veiculo {

	private int qdadeVolumes;

	public void lerDados() {

		super.lerDados();
		System.out.println("Informe a quantidade de volumes: ");
		setQdadeVolumes(scan.nextInt());

	}
	
	public void imprimir() {
		
		super.imprimir();
		System.out.println("Quantidade de volumes: "+getQdadeVolumes());
		
	}

	public Carro() {
		super();
	}

	public Carro(String chassi, String fabricante, String modelo, int qdadeVolumes) {
		super(chassi, fabricante, modelo);
		this.qdadeVolumes = qdadeVolumes;
	}

	public int getQdadeVolumes() {
		return qdadeVolumes;
	}

	public void setQdadeVolumes(int qdadeVolumes) {
		this.qdadeVolumes = qdadeVolumes;
	}

	@Override
	public String toString() {
		return "Carro [qdadeVolumes=" + qdadeVolumes + ", getQdadeVolumes()=" + getQdadeVolumes() + ", getChassi()="
				+ getChassi() + ", getFabricante()=" + getFabricante() + ", getModelo()=" + getModelo()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
