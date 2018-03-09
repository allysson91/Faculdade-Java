package Animais;

public class Cachorro extends Animal {
	
	private int codigoPedigree;
	private String raca;
	
	
	
	public Cachorro(String nome, String dataNascimento, String cor,int codigoPedigree, String raca) {
		super(nome, dataNascimento, cor);
		this.codigoPedigree = codigoPedigree;
		this.raca = raca;
	}
	public Cachorro() {
		super();

	}

	public void lerDados() {
		super.lerDados();
		System.out.println("Informar o código pedigree: ");
		codigoPedigree = scan.nextInt();
		System.out.println("Informar a raça: ");
		raca = scan.nextLine();
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Código de pedigree: "+this.codigoPedigree);
		System.out.println("Raça: "+this.raca);
	}
	
	public int getCodigoPedigree() {
		return codigoPedigree;
	}
	public void setCodigoPedigree(int codigoPedigree) {
		this.codigoPedigree = codigoPedigree;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	

}
