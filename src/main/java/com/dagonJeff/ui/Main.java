package com.dagonJeff.ui;

import com.dagonJeff.persistence.migration.MigrationStrategy;

import static com.dagonJeff.persistence.config.ConnectionConfig.getConnection;

import java.sql.SQLException;

public class Main {
	
	public static void main(String[] args) throws SQLException {
		
		try(var connection = getConnection()){
			new MigrationStrategy(connection).executeMigration();
		}
	}

}
