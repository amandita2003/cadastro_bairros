<%@ page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Lista de clientes</h2>
<table border="1">
<tr bgcolor="gray">
<th>Id</th><th>Nome</th><th>População</th>
</tr>

<c:forEach var="clienteCorrente" items="${listaDeClientes}">

<tr>
<td width="50">${clienteCorrente.id}</td>
<td width="400">${clienteCorrente.nome}</td>
<td width="50">${clienteCorrente.idade}</td>
</tr>

</c:forEach>
</table>
</body>
</html>