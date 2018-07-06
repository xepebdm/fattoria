<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tabela</title>
</head>
<body>
	<h1>Tabela de produtos</h1>
	
	
	<table>
	
<style>
table, td, th, tfoot {border:solid 1px #000; padding:5px;}
th {background-color:#999;}
caption {font-size:x-large;}
colgroup {background:#F60;}
.coluna1 {background:#F66;}
.coluna2  {background:#F33;}
.coluna3  {background:#F99;}
</style>
	

	<tr>
		<th>Id</th>	
		<th>Nome</th>
		<th>Preço</th>
		<th>Quantidade</th>
		<th>Data</th>
	</tr>
	
	<c:forEach items="${lista.produtos}" var="produto">
		<tr>
			<td>${produto.id}</td>
			<td>${produto.nome}</td>
			<td>${produto.preco}</td>
			<td>${produto.quantidade}</td>
			<td>${produto.data}</td>					
		</tr>
	</c:forEach>
</table>


<form name="cad" action="home" method="post">
<input type="submit" id="btnAdd"  value="Adicionar"/>
</form> 

<form name="deletar" action="deletar" method="get"> 
		ID:<input type="number" name="id" id="id" size="9" />
		<input type="submit" value="Deletar por ID"/>
</form>
<form name="editar" action="editar" method="get"> 
		ID:<input type="number" name="id" id="id" size="9" />
		<input type="submit" value="Editar por ID"/>
</form>


<script type="text/javascript">
	var id = parseInt(document.querySelector("id"));
	

</script>

	
</body>
</html>