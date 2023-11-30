<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Confirmar exclusão</h1>
id: ${bairro.id};
<br>
nome: ${bairro.nome};
<br>
populacao: ${bairro.populacao};
<br>
<a href="excluirBairroBD?id=${bairro.id}"><input type="submit" name="btnExcluir" value="excluir" /></a>
<a href="listarTodosBairros"><input type="submit" name="btnCancelar" value="cancelar"/></a>
</body>
</html>