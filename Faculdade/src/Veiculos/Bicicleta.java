package Veiculos;

public class Bicicleta extends Veiculo {

	private String modeloCatraca;
	private String tipoCorrente;
	
	public Bicicleta(String chassi, String fabricante, String modelo, String modeloCatraca, String tipoCorrente) {
		super(chassi, fabricante, modelo);
		this.modeloCatraca = modeloCatraca;
		this.tipoCorrente = tipoCorrente;
	}
	
	public void lerDados() {
		
		super.lerDados();
		System.out.println("Informe o modelo da catraca: ");
		setModeloCatraca(scan.nextLine());
		System.out.println("Informe o tipo da corrente: ");
		setTipoCorrente(scan.nextLine());
		
	}
	
	public void imprimir() {
		
		super.imprimir();
		System.out.println("Modelo da catraca: "+getModeloCatraca());
		System.out.println("Tipo da corrente: "+getTipoCorrente());
		
	}
	
	public Bicicleta() {
		super();
	}
	
	public String getModeloCatraca() {
		return modeloCatraca;
	}
	
	public void setModeloCatraca(String modeloCatraca) {
		this.modeloCatraca = modeloCatraca;
	}
	
	public String getTipoCorrente() {
		return tipoCorrente;
	}
	
	public void setTipoCorrente(String tipoCorrente) {
		this.tipoCorrente = tipoCorrente;
	}

	@Override
	public String toString() {
		return "Bicicleta [modeloCatraca=" + modeloCatraca + ", tipoCorrente=" + tipoCorrente + ", getModeloCatraca()="
				+ getModeloCatraca() + ", getTipoCorrente()=" + getTipoCorrente() + ", getChassi()=" + getChassi()
				+ ", getFabricante()=" + getFabricante() + ", getModelo()=" + getModelo() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
