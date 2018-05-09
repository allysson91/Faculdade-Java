package exercicioConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MinhaConexao {

	public static void main(String[] args) {
		new MinhaConexao().processar();
	}

	private void processar() {
		getConexao();
	}

	public Connection getConexao() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver não disponivel");
		}
		String url = "jdbc:mysql://192.168.56.101:3306/empresa";
		// Connection con;
		try (Connection con = DriverManager.getConnection(url, "root", "123mudar");) {

		} catch (SQLException e) {
			System.out.println("Usuário ou senha inválido");
		}
		return null;

	}
}