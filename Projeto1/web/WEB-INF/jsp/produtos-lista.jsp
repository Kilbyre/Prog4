<%-- 
    Document   : produtos-lista
    Created on : 14/08/2015, 18:56:10
    Author     : renan.campos
--%>

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
            <ul>
                <%
                    List<Produto> produtos = (List<Produto>) request.getAttribute("produtos");
                    for(Produto produto: produtos){
                %>
                    
                <div>
                    <p><%=produtos.%></p>
                    
                    
                </div>
                
                <%
                        out.print(produtos.get(i));
                    }
                %>
            </ul>
        </div>
    </body>
</html>

