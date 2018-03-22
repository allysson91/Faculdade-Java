package swingXML;

public final class Negocio {
	
	private double preco;
	private int quantidade;
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getVolume() {
		
		return this.preco*this.quantidade;
		
	}

}
