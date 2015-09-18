package br.pucpr.prog4.loja.models.dao;
import br.pucpr.prog4.loja.models.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcPessoaDAO implements PessoaDAO{
    
    private Connection conexão;

    public JdbcPessoaDAO(Connection conexão) {
        this.conexão = conexão;
    }
    
    
    
    
    @Override
    public Pessoa inserir(Pessoa pessoa) {
        
        PreparedStatement stmt;
        try {
            stmt = conexão.prepareStatement("INSERT INTO pessoa (nomePessoa, tipoPessoa, dataNascimento, sexo, comentarios, CPF) values (?, ?, ?, ?, ?, ?)");
            stmt.setString(1, pessoa.getNomePessoa());
            stmt.setString(2, pessoa.getTipoPessoa());
            stmt.setDate(3, new java.sql.Date(pessoa.getDataNascimento().getTime()));
            stmt.setString(4, pessoa.getSexo());
            stmt.setString(5, pessoa.getComentarios());
            stmt.setInt(6, pessoa.getCPF());
            stmt.executeUpdate();
            return pessoa;
        } catch (SQLException ex) {
            throw new DaoException("Ocorreu um erro ao inserir Pessoa");
        }
    }
    
    
    
}
