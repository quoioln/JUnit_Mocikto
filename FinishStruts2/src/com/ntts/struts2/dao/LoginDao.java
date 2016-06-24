package com.ntts.struts2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

	public static boolean validate(Connection conn, String fullname, String password) {
		boolean status = false;
		try {
//			String URL = "jdbc:postgresql://192.168.17.41:5432/DemoStruts2";
//			Class.forName("org.postgresql.Driver");
//			Connection conn = DriverManager.getConnection(URL, "postgres", "postgres");

			PreparedStatement ps = conn.prepareStatement("select * from registration where FullName=? and Password=?");
			ps.setString(1, fullname);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			status = rs.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}