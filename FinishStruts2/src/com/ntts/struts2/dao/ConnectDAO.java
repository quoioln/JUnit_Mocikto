package com.ntts.struts2.dao;

import java.sql.Connection;
import java.sql.DriverManager;


import com.ntts.struts2.register.RegisterAction;

public class ConnectDAO {
	
	public static boolean logindao(String fullname, String password){
		try {
			String URL = "jdbc:postgresql://192.168.17.41:5432/DemoStruts2";
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(URL, "postgres", "postgres");

			return LoginDao.validate(conn, fullname, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static int registerdao(RegisterAction r){
		try{
			String URL = "jdbc:postgresql://192.168.17.41:5432/DemoStruts2";
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(URL, "postgres", "postgres");
			return RegisterDao.save(conn, r);
		}catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}

}
