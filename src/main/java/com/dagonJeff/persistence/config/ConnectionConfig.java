package com.dagonJeff.persistence.config;

import static lombok.AccessLevel.PRIVATE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.NoArgsConstructor;

@NoArgsConstructor(access = PRIVATE)
public final class ConnectionConfig {
	
	public static Connection getConnection() throws SQLException{
		
		var url = "jdbc:mysql://localhost/board";
		var user = "board";
		var password = "board";
		var connnection = DriverManager.getConnection(url, user, password);
		connnection.setAutoCommit(false);
		
		return connnection;
		
	}

}
