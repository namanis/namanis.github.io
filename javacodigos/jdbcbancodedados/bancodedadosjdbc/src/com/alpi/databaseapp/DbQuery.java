package com.alpi.databaseapp;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
// Program to illustrate how to query a database
class DbQuery {
public static void main(String[] args) {
// Get connection, execute query, get the result set
// and print the entries from the result rest
try (Connection connection = DbConnector.connectToDb();
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery("SELECT * FROM contact")){
System.out.println("ID \tfName \tlName \temail \t\tphoneNo");
/*while (resultSet.next()) { //essa configuracao é mais tradicional pois sabemos o tipo de dados
System.out.println(resultSet.getInt(1) + "\t"
+ resultSet.getString(2) + "\t"
+ resultSet.getString(3) + "\t"
+ resultSet.getString(4) + "\t"
+ resultSet.getString(5));
}*/
//from resultSet metadata, find out how many columns there are
//and then read the column entries
//utilizamos essa configuracao quando não conhecemos os dados no database
int numOfColumns = resultSet.getMetaData().getColumnCount();
while (resultSet.next()) {
//remember that the column index starts from 1 not 0
for(int i = 1; i <= numOfColumns; i++) {
//since we do not know the data type of the column, we use getObject()
System.out.print(resultSet.getObject(i) + "\t");
}
System.out.println("");
}
}
catch (SQLException sqle) {
sqle.printStackTrace();
System.exit(-1);
}
}
}