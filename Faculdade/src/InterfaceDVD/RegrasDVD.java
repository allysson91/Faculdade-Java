package InterfaceDVD;

import java.util.ArrayList;

public class RegrasDVD implements interfaceDVD {

	ArrayList<EstruturaDVD> listaVetor = new ArrayList<>();

	@Override
	public void adicionarDVD(EstruturaDVD dvds) {
		this.listaVetor.add(dvds);

	}

	@Override
	public void imprimirEstoque() {
		for (EstruturaDVD estruturaDVD : this.listaVetor) {
			System.out.println("Nome: " + estruturaDVD.getNomeCliente());
			System.out.println("Preço: " + estruturaDVD.getPreco()+"\n");
		}

	}

}
