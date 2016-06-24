package com.ntts.struts2.dao;

import java.sql.*;

import com.ntts.struts2.register.RegisterAction;

public class RegisterDao {
	public static int save(Connection conn, RegisterAction r) {
		int status = 0;
		try {
//			String URL = "jdbc:postgresql://192.168.17.41:5432/DemoStruts2";
//			Class.forName("org.postgresql.Driver");
//			Connection conn = DriverManager.getConnection(URL, "postgres", "postgres");
			PreparedStatement ps = conn.prepareStatement("insert into registration values(?,?,?,?,?)");
			ps.setString(1, r.getFullname());
			ps.setString(2, r.getPassword());
			ps.setString(3, r.getGender());
			ps.setString(4, r.getEmail());
			ps.setString(5, r.getCountry());
			
			status = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
