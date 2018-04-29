package TableModel;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class ContaCorrenteTabelaDinamica {

	public static void main(String[] args) {
		new ContaCorrenteTabelaDinamica().processar();
	}
	
	private void processar() {
		
		JTable table = new JTable();
		JFrame janela = new JFrame();
		JPanel painelPrincipal = new JPanel();
		
		
		
		table.setBorder(new LineBorder(Color.BLACK));
		table.setGridColor(Color.BLACK);
		table.setShowGrid(true);
		table.setBackground(Color.CYAN);
		JScrollPane scroll = new JScrollPane(table);
		
		List<ContaCorrente> listacontas = new ArrayList<>();
		ContaCorrente conta;
		conta = new ContaCorrente(100, 123456, 200,"Zezim");
		listacontas.add(conta);
		}
		
		contaCorrenteTableModel ntm = new contaCorrenteTableModel(listacontas);
		table.setModel(ntm);
		
		
		janela = new JFrame ("Exemplo Table Model Conta Corrente");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(900, 500);
		janela.setVisible(true);
		
		janela.add(painelPrincipal);
		janela.add(table);
		
	}
	
}
