package br.com.farmacia.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
private static final String USUARIO = "postgres";
private static final String SENHA = "postgres";
private static final String URL = "jdbc:postgresql://127.0.0.1:5432/sistema";

public static Connection conectar() throws SQLException{
	
	//Referencia ao Driver mysql para versões antigas do java
//	DriverManager.registerDriver(new com.post);
	 try {
		Class.forName("org.postgresql.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
	return conexao;
}

public static void main(String[] args) {
	try{
	Connection conexao = ConexaoFactory.conectar();
	System.out.println("Conectado com sucesso!!");
	}
	
	catch(SQLException ex){
		ex.printStackTrace();
		System.out.println("Conexão falhou!!");
	}
}

}
