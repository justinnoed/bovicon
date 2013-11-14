package br.com.dao;

import java.sql.*;
public class ConnectionFactory {
	// Editando no Eclipse...
  // Editando no Browser...
	public static void main(String[] args) {
}
		public Connection getConnection(){
			try {
				try {
					Class.forName("org.postgresql.Driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				return DriverManager.getConnection("jdbc:postgresql://localhost:5432/justinsoft", "postgres", "22222");
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
}
