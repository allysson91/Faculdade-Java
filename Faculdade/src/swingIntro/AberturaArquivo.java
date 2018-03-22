package swingIntro;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class AberturaArquivo {

	public static void main(String[] args) {

		// Criamos a tela para abertura dos diretórios
		JFileChooser chooser = new JFileChooser();
		
		// Aponta para o diretório atual. ùltimo utilizado no micro.
		chooser.setCurrentDirectory(new java.io.File("."));
		
		// Titulo da Janela
		chooser.setDialogTitle("Abertura diretório.");
		
		// Definindo que somente será disponibilizado diretórios
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		
		// Não apresentará arquivos
		chooser.setAcceptAllFileFilterUsed(false);
		
		// Apresentará a tela no centro do monitor.
		int retAbertura = chooser.showOpenDialog(null);
		
		// Caso algum diretório seja escolhido retornará
		
		// APPROVE_OPTION
		if (retAbertura == JFileChooser.APPROVE_OPTION) {
			JOptionPane.showMessageDialog(null, "Diretório escolhido: "+chooser.getCurrentDirectory());
			// Caso o botão cancelar seja pressionado.
		} else if (retAbertura == JFileChooser.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Botão cancelar foi escolhido");
		} else if (retAbertura == JFileChooser.ERROR_OPTION) {
			JOptionPane.showMessageDialog(null, "Erro na seleção do arquivo. ");
		}
	}
}
