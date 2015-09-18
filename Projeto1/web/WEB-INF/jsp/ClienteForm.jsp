<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 style="text-align:center;">Meu Cadastro</h1>
        <form style="text-align:center;" action="" method="POST" action="/pessoa/cadastro">
            <label for="Pessoa Fisica">Pessoa Fisica </label>
            <input type="radio" name="tipoPessoa" value="PF" />
            
            <label for="Pessoa Juridica">Pessoa Juridica </label>
            <input type="radio" name="tipoPessoa" value="PJ" />
            <br><br>
            
            <label for="nome">Nome: </label><br>
            <input type="text" name="nomePessoa" id="Nome" />
            <br><br>
            
            <label for="CPF">CPF: </label><br>
            <input type="text" name="CPF" id="CPF" />
            <br><br>
            
            <label for="dataNascimento">Data de Nascimento: </label><br>
            <input type="date" name="dataNascimento" id="dataNascimento" />
            <br><br>
            
            <label for="sexo">Sexo </label><br>
            <select id="sexo" name="sexo">
                <option> Masculino </option>
                <option> Feminino </option>
            </select>
            <br><br>
            
            <label for="DataNascimento">Comentarios: </label><br>
            <textarea cols="50" rows="5" name="comentarios"></textarea>
            <br><br>
            
            <input type="submit" value="Salvar" />
        </form>
        
        
        
    </body>
</html>
