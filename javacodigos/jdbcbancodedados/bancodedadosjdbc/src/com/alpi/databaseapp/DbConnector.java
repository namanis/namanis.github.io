package com.alpi.databaseapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// Utility class with method connectToDb() that will be used by other programs in this chapter
public class DbConnector {
public static Connection connectToDb() throws SQLException {
String url = "jdbc:mysql://localhost:3306/";
String database = "adressbook";
String userName = "root";
String password = "";
return DriverManager.getConnection(url + database, userName, password);
}
}