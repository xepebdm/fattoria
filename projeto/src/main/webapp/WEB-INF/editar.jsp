<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar produto</title>
</head>
<h1>Editar produto</h1>
<body>

<form name="cad" action="add-e-remove" method="post">  
	ID: <input readonly="true" name="id" type="number" id="id" size="15" value="${id}" />
	<br>Nome: <input name="nome" type="text" id="nome" size="15" value="${produto.nome}" />
	<br>Preço: <input type="number" name="preco" id="preco" size="9" value="${produto.preco}"/>
	<br>Quantidade:<input type="number" name="qtd" id="qtd" size="6" value="${produto.quantidade}"/>
	<br>Data:<input type="date" name="dataDeCadastro" id="dataDeCadastro" size="15" value="${produto.data}"/>
	<br><input type="submit" id="btnAdd"   value="Editar"/>
</form>


<script type="text/javascript">
var id = ${id};
var nome = document.querySelector("nome");
var preco = document.querySelector("preco");
var qtd = document.querySelector("qtd");
var data = document.querySelector("dataDeCadastro");

</script>

</body>
</html>