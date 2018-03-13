package Animais;

public class Ave extends Animal{

	private String tipoBico;
	private String estiloVoo;
	
	public Ave(String nome, String dataNascimento, String cor,String tipoBico, String estiloVoo) {
		super(nome, dataNascimento, cor);
		this.tipoBico = tipoBico;
		estiloVoo = estiloVoo;
	}
	public Ave() {
		super();
	}
	
	
	public void lerDados() {
		super.lerDados();
		System.out.println("Informar o tipo de bico: ");
		tipoBico = scan.nextLine();
		System.out.println("Informar o estilo de voo: ");
		estiloVoo = scan.nextLine();
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Tipo de bico: "+getTipoBico());
		System.out.println("Estilo de voo: "+getEstiloVoo());
		
	}

	public String getTipoBico() {
		return tipoBico;
	}
	public void setTipoBico(String tipoBico) {
		this.tipoBico = tipoBico;
	}
	public String getEstiloVoo() {
		return estiloVoo;
	}
	public void setEstiloVoo(String estiloVoo) {
		estiloVoo = estiloVoo;
	}
	@Override
	public String toString() {
		return "Ave [tipoBico=" + tipoBico + ", estiloVoo=" + estiloVoo + ", scan=" + scan + ", getTipoBico()="
				+ getTipoBico() + ", getEstiloVoo()=" + getEstiloVoo() + ", getNome()=" + getNome()
				+ ", getDataNascimento()=" + getDataNascimento() + ", getCor()=" + getCor() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
