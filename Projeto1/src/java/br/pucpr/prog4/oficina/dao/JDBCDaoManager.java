package br.pucpr.prog4.oficina.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JDBCDaoManager implements DaoManager{
    private Connection conexão;
    private JDBCCarroDAO carroDAO;
    
    public JDBCDaoManager()
    {
        
    }
    
    
    @Override
    public void iniciar() throws br.pucpr.prog4.loja.models.dao.DaoException
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url;
            url = "jdbc:mysql://localhost:3306/oficina";
            conexão = DriverManager.getConnection(url, "root", "root");
            conexão.setAutoCommit(false);
            carroDAO = new JDBCCarroDAO(conexão);
//            clienteD.setConexão(conexão);
            
        }
        catch( Exception ex )
        {
            throw new br.pucpr.prog4.loja.models.dao.DaoException("Ocorreu um erro ao conectar ao banco de dados:" + 
                    ex.getMessage());
        }
    }

    @Override
    public void encerrar() 
    {
        try {
            if(!conexão.isClosed())
                conexão.close();
        } catch (SQLException ex) {
            
        }
    }

    @Override
    public void confirmarTransação(){
        try {
            conexão.commit();
        } catch (SQLException ex) {
            throw new br.pucpr.prog4.loja.models.dao.DaoException("Ocorreu um erro ao confirmar a transação");
        }
    }

    @Override
    public void abortarTransação() {
        try {
            conexão.rollback();
        } catch (SQLException ex) {
            throw new br.pucpr.prog4.loja.models.dao.DaoException("Ocorreu um erro ao abordar a transição");
        }
    }

    @Override
    public CarroDAO getCarroDAO() {
        return carroDAO;
    }
}
