package com.bilgeadam.boost.java.lesson042;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionTest {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost/northwind";
	//	String url = "jdbc:postgresql://localhost/northwind?user=postgres?password=asdsaddas";
		
		try {
			Connection conn = DriverManager.getConnection(url,"postgres","asdsaddas");
			System.out.println("Connected to the database successfully.");
			
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM products;";
			stmt.executeQuery(sql);
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString("quantity_per_unit"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
