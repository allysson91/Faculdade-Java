package TableModel;

public class ContaCorrente {

	private int agencia;
	private int conta;
	private float saldo;
	private String nomeCLiente;
	
	
	
	public ContaCorrente(int agencia, int conta, float saldo, String nomeCLiente) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.nomeCLiente = nomeCLiente;
	}
	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public String getNomeCLiente() {
		return nomeCLiente;
	}
	public void setNomeCLiente(String nomeCLiente) {
		this.nomeCLiente = nomeCLiente;
	}
	
	
	
	
}
