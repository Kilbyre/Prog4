<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="br.pucpr.prog4.loja.models.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Index</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>
            <h1 style="text-align: center;">Lista de Produtos</h1>
            <hr>
            <br><br>
            <table style="width:100%; height: 100%;">
                <tr>
                    <th>Id</th>
                    <th>Foto</th>
                    <th>Nome</th>
                    <th>Preco</th>
                </tr>
                
                <c:forEach var="p" items="${produtos}">
                    <tr style="text-align: center;">
                        <td><c:out value="${p.idProduto}"></c:out></td>
                        <td><img width="100px" height="100px" src="../imagem/${p.nomeProduto}.jpg" alt="imagem"></td>
                        <td><c:out value="${p.nomeProduto}"></c:out></td>
                        <td>R$<c:out value="${p.precoProduto}"></c:out></td>
                    </tr>
                </c:forEach>
                
            </table>
        </div>
    </body>
</html>

