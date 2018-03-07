package Exercicio2Heranca;

public class Carro extends Veiculo {

	private int qdadeVolumes;

	public int getQdadeVolumes() {
		return qdadeVolumes;
	}

	public void setQdadeVolumes(int qdadeVolumes) {
		this.qdadeVolumes = qdadeVolumes;
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Carro [qdadeVolumes=" + qdadeVolumes + "]";
	}
	
	
	
}
