package com.future.spider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class SpiderService {
	
	@Autowired

	org.apache.commons.dbcp.BasicDataSource dataSource;
	
	
	
	public void query(){
		
		
		
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("org.teiid.jdbc.TeiidDriver");
			//String url = "jdbc:spider:abc@mm://192.168.13.166:31000";
			//String user = "user";
			//String pwd = "user";
			conn = this.dataSource.getConnection();//DriverManager.getConnection(url, user, pwd);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from qyrk.PISTABLE0 a,ggfw.HOLDER_INFO_TB b where a.PISFIELD011 = b.CARD_ID and b.CARD_ID='610323198002044228'");
			while(rs.next()) {
				System.out.println(rs.getString("CARD_ID"));;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
