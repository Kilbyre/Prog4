package br.pucpr.prog4.oficina.models;
import br.pucpr.prog4.oficina.dao.*;

public class CarroManagerImpl implements CarroManager{
    
    @Override
    public Carro Cadastrar(Carro carro) {
        DaoManager manager = new JDBCDaoManager();
        try {
            manager.iniciar();
            CarroDAO dao = manager.getCarroDAO();
            dao.inserir(carro);
            manager.confirmarTransação();
            manager.encerrar();
            return carro;
        } catch (Exception ex) {
            manager.abortarTransação();
            throw ex;
        }
    }

    
}
