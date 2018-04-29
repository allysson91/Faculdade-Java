package TableModel;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class contaCorrenteTableModel extends AbstractTableModel{

	private List<ContaCorrente> contas;

	public contaCorrenteTableModel(List<ContaCorrente> contas) {
		this.contas = contas;
	}
	
	

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 4;
	}

	//quantas linhas a tabela vai montar no return
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return this.contas.size();
	}

	@Override
	public Object getValueAt(int linha, int coluna) {
		ContaCorrente n = this.contas.get(linha);
		
		switch(coluna) {
		case 0:
			return n.getAgencia();
		case 1:
			return n.getConta();
		case 2:
			return n.getNomeCLiente();
		case 3:
			return n.getSaldo();
		}
		
		return null;
	}

}
