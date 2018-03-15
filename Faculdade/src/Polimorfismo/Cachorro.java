package Polimorfismo;

public class Cachorro implements Animal {

	@Override
	public void emitirSom() {
		System.out.println("AU AU");
		
	}

	@Override
	public void movimentar() {
		System.out.println("Correndo");
		
	}

}
