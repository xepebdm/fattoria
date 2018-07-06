<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta charset="utf-8">

<c:forEach var="produto" items="${lista.produtos}">
<tr>
	<td>${produto.nome}</td>
</c:forEach>