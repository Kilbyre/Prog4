<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro de Carros</h1>
        <hr>
        <form style="text-align:center;" action="" method="POST" action="/carro/cadastro">
            Placa:
            <input type="text" name="placa">
            <br><br>

            Tipo:
            <select name="tipo">
                <option value="carro">Carro</option>
                <option value="caminhao">Caminhão</option>
                <option value="moto">Moto</option>
            </select>
            <br><br><br>
            
            <input type="submit" value="Cadastrar Veiculo">
            
            
        </form>
    </body>
</html>
