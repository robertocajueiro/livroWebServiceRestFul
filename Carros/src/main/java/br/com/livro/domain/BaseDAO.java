package br.com.livro.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
	public BaseDAO() {
		try {
			// Necessario para utilizar o driver JDBC do Mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e ) {
			// Erro de driver JDBC (adicione o driver .jar do Mysql em /WEB-INF/lib)
			e.printStackTrace();
		}
	}
	
	protected Connection getConnection() throws SQLException {
		// URL DE CONXEXAO COM O BANCO DE DADOS
		String url = "jdbc:mysql://localhost/livro";
		// Conecta utilizando a URL, usuario e senha
		Connection conn = DriverManager.getConnection(url, "root", "123456");
		return conn;
	}
	
	public static void main(String [] args) throws SQLException {
		BaseDAO db = new BaseDAO();
		// testa a conexão
		Connection conn = db.getConnection();
		System.out.println(conn);
	}

}
