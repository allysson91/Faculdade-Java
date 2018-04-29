package JTable;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExemplo {

	public static void main(String[] args) {

		new JTableExemplo().processar();

	}

	public void processar() {

		// criar as colunas da tabela Jtable
		String colunas[] = { "Móveis", "Eletro", "Utensílios" };
		//Criar os registros da jtable
		String valores[][] = { { "Sofá", "TV", "Faca" } };
		
		//criar o JTable
		JTable table = new JTable(valores,colunas);
		JScrollPane srollPane = new JScrollPane(table);
		JPanel painel = new JPanel();
		JFrame tela = new JFrame("Minha tabela sinistra");
		
		
		painel.add(srollPane, BorderLayout.CENTER);
		painel.setBackground(Color.GRAY);
		
		tela.add(painel);
		tela.setVisible(true);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(300,300);
		
		
		
		
	}

}
