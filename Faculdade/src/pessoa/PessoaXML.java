package pessoa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class PessoaXML {
	
	public void carregarArquivo() throws FileNotFoundException {

		File localArquivo = new File("/home/allysson/Documentos/java");
		JFileChooser telaArquivo = new JFileChooser(localArquivo);
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("Apenas XML", "xml");
		telaArquivo.setFileFilter(filtro);
		//telaArquivo.showOpenDialog(null);
		int retorno = telaArquivo.showOpenDialog(null);

		if (retorno == JFileChooser.APPROVE_OPTION) {

			File arqSelec = telaArquivo.getSelectedFile();
			try (FileReader reader = new FileReader(arqSelec);) {
				List<Pessoa> pessoas = carregarDadosArqXML(reader);
				for (Pessoa pessoa : pessoas) {
					JOptionPane.showMessageDialog(null, "Nome: "+pessoa.getNome()+"\nEndereço: "+pessoa.getEndereco());
					//JOptionPane.showMessageDialog(null, "Endereço: "+pessoa.getEndereco());
				}

			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "Arquvivo não localizado");
				e.printStackTrace();
			}
			JOptionPane.showConfirmDialog(null, "Clicou no abrir");
		}
		if (retorno == JFileChooser.CANCEL_OPTION) {
			JOptionPane.showConfirmDialog(null, "Clicou no cancelar");
		}
		if (retorno == JFileChooser.ERROR_OPTION) {
			JOptionPane.showConfirmDialog(null, "Deu ruim");
		}
	}

	private List<Pessoa> carregarDadosArqXML(FileReader arqXML) {
		XStream fluxoXML = new XStream(new DomDriver());
		fluxoXML.alias("pessoa", Pessoa.class);
		List<Pessoa> listaPessoa = (List<Pessoa>) fluxoXML.fromXML(arqXML);
		return listaPessoa;
	}

	public static void main(String[] args) {
		new PessoaXML().processar();
	}

	public void processar() {
		try {
			carregarArquivo();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
