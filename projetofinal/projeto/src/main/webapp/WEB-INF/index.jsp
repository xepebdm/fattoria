<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta charset="utf-8">
<h1>Bem-vindo!</h1>

<h3>Adicionar produto</h3>
<form name="cad" action="adiciona" method="post">  
<label for="nome"></label>
Nome: <input name="nome" type="text" id="nome" size="15" />
<br>Preço: <input type="number" name="preco" id="preco" size="9" />
<br>Quantidade:<input type="number" name="qtd" id="qtd" size="6" />
<br>Data:<input type="date" name="dataDeCadastro" id="dataDeCadastro" size="15" />
<br><input type="submit" id="btnAdd" onclick="verifica()"   value="Adicionar"/>
</form>



<script type="text/javascript">
	var nome = document.querySelector("nome");
	var preco = parseInt(document.querySelector("preco"));
	var quantidade = parseInt(document.querySelector("qtd"));
	var data = document.querySelector("dataDeCadastro");

	function verifica(){
		if(document.getElementById("nome").value.length < 1){
			alert('Por favor, preencha o campo nome');
			document.getElementById("nome").focus();
			return false
		}else if(document.getElementById("preco").value.length < 1){
			alert('Por favor, preencha o campo preço');
			document.getElementById("preco").focus();
			return false
		}else if(document.getElementById("qtd").value.length < 1){
			alert('Por favor, preencha o campo quantidade');
			document.getElementById("qtd").focus();
			return false
		}else if(document.getElementById("dataDeCadastro").value.length < 1){
			alert('Por favor, preencha o campo data');
			document.getElementById("dataDeCadastro").focus();
			return false
		}else{
			return true;
		}
	}


</script>