<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Lista de bairros</title>
</head>
<body style="margin-top: -20px;">

	<c:import url="cabecalho.jsp" />
	

	<h2>Lista de bairros</h2>
	
	<table border="1">
		<tr bgcolor="gray">
			<th>Id</th><th>Nome</th><th>População</th><th>Excluir</th><th>Consultar</th>
		</tr>
     <c:forEach var="bairroCorrente" items="${listaDeBairros}">
		<tr>
			<td width="50">${bairroCorrente.id}</td>
			<td width="400">${bairroCorrente.nome}</td>
			<td width="50">${bairroCorrente.populacao}</td>
			<td width="50"><a href="excluirBairro?id=${bairroCorrente.id}">Excluir</a></td>
			<td width="50"><a href="consultar?id=${bairroCorrente.id}">Consultar</a></td>
		</tr>
	  </c:forEach>

	</table>
	

	<br />	
	<input type="button" name="btnVoltar" value="Voltar" onclick="history.go(-1);">

	<br />
	<br />
	<c:import url="rodape.jsp" />

</body>
</html>