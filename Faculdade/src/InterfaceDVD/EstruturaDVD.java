package InterfaceDVD;

public class EstruturaDVD{
	
	private double preco;
	private String nomeCliente;
	public double getPreco() {
		return preco;
	}
	
	
	
	public EstruturaDVD() {
		super();
	}



	public EstruturaDVD(double preco, String nomeCliente) {
		super();
		this.preco = preco;
		this.nomeCliente = nomeCliente;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	

}
