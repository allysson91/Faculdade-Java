package Polimorfismo;

public class PrincipalAnimal {

	public void processar() {

		Animal generico = new Cachorro();
		som(generico);
		Animal generico2 = new Galinha();
		som(generico2);
		
	}
	
	public void som(Animal generico) {
		generico.emitirSom();
	}

	public static void main(String[] args) {
		new PrincipalAnimal().processar();
	}

}
