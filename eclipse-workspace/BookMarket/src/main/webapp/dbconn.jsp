<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%
	Connection conn = null;

	try {
		String url = "jdbc:mysql://localhost:3306/bookmarketdb"; 
		String user = "root";
		String password = "0000";
		
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection (url, user, password);
		
	} catch (SQLException ex) {
		out.println("데이터베이스 연결이 실패되었습니다.<br>");
		out.println("SQLException: " + ex.getMessage());

	}

%>
	