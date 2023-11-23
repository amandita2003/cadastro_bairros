<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar bairro</title>
</head>
<body>
<c:if test="${not empty mensagem}">

<font color="green">${mensagem}</font>

</c:if>
<h2>Cadastrar bairro:</h2>
<form action="salvarBairro" method="post">


Nome:
<br />
<input type="text" name=

"nome" value=

"${umCliente.nome}">

<br /><br />
População:
<br />
<input type="text" name=

"populacao" value=

"${umCliente.idade}">

<br /><br />
<input type="submit" name=

"btnSalvar" value=

"Salvar">

</form>


</body>
</html>