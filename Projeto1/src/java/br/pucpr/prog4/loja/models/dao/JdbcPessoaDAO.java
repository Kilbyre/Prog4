package br.pucpr.prog4.loja.models.dao;

import br.pucpr.prog4.loja.models.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JdbcPessoaDAO implements PessoaDAO{
    
    private Connection conexão;

    public JdbcPessoaDAO(Connection conexão) {
        this.conexão = conexão;
    }
    
    
    
    
    @Override
    public Pessoa inserir(Pessoa pessoa) {
        
        PreparedStatement stmt;
        try {
            stmt = conexão.prepareStatement("INSERT INTO pessoa(nomeCliente, tipoCliente, dataNascimento, sexo, comentarios) values (?,?,?,?,?)");
            stmt.setString(1, pessoa.getNomeCliente());
            stmt.setString(2, pessoa.getTipoCliente());
            stmt.setDate(3, new java.sql.Date(pessoa.getDataNascimento().getTime()));
            stmt.setString(4, pessoa.getSexo());
            stmt.setString(5, pessoa.getComentarios());
            stmt.executeQuery();
            return pessoa;
        } catch (SQLException ex) {
            throw new DaoException("Ocorreu um erro ao inserir Pessoa");
        }
    }
    
    
    
}
