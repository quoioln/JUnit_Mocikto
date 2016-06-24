package com.ntts.struts2.h2db;

import java.sql.*;

public class H2dbDAO {

	public void createTable(Connection conn ) {
		try {
			//Class.forName("org.h2.Driver");
			//Connection conn = DriverManager.getConnection("jdbc:h2:~/test","sa", "");
			String sql = "CREATE TABLE registration"
					+ "("
					+ "fullname varchar(50),"
					+ "password varchar(50),"
					+ "gender varchar(50),"
					+ "email varchar(1000),"
					+ "country varchar(1000)"
					+ ");";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteTable(Connection conn){
		try{
			String sql = "DROP TABLE registration";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
