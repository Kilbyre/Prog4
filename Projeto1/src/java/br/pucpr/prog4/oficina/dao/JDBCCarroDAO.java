package br.pucpr.prog4.oficina.dao;
import br.pucpr.prog4.oficina.models.Carro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class JDBCCarroDAO implements CarroDAO{
    private Connection conexão;

    public JDBCCarroDAO(Connection conexão) {
        this.conexão = conexão;
    }
    
    @Override
    public Carro inserir(Carro carro) {
        PreparedStatement stmt;
        try {
            stmt = conexão.prepareStatement("INSERT INTO carro (placa, tipo) values (?, ?)");
            stmt.setString(1, carro.getPlaca());
            stmt.setString(2, carro.getTipo());
            stmt.executeUpdate();
            return carro;
        } catch (SQLException ex) {
            throw new br.pucpr.prog4.loja.models.dao.DaoException("Ocorreu um erro ao inserir um Carro");
        }
    }
}
