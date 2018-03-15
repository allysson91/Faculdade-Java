package Polimorfismo;

public class Galinha implements Animal {

	@Override
	public void emitirSom() {
		System.out.println("Pocó");

	}

	@Override
	public void movimentar() {
		System.out.println("Siscar");

	}

}
