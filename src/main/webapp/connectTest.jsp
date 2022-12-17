<%@page import="library.Book.BookDTO"%>
<%@page import="java.util.List"%>
<%@page import="library.Book.BookDAO"%>
<%@page import="library.comm.ConnectPool"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>커넥션 풀 연결 성공</h2>
	<%
	ConnectPool pool = new ConnectPool();
	pool.close();
	%>
	
	<%
	BookDAO dao = new BookDAO();
	List<BookDTO> dto = dao.selectList();
	
	for(BookDTO d : dto){
		
		System.out.printf("%-20s\t %-10s\n", d.getBook_title(), d.getBook_author());
	}
	dao.close();
	%>
</body>
</html>