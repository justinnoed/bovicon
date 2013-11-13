package br.com.dao;

import java.sql.*;
public class ConnectionFactory {
	// Editando no Eclipse...
	public static void main(String[] args) {
}
		public Connection getConnection(){
			try {
				try {
					Class.forName("org.postgresql.Driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				return DriverManager.getConnection("jdbc:postgresql://localhost:5432/justinsoft", "postgres", "x7b2h9k3");
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
}
