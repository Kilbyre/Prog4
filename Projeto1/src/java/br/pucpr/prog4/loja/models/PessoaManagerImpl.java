package br.pucpr.prog4.loja.models;

import br.pucpr.prog4.loja.models.dao.IDaoManager;
import br.pucpr.prog4.loja.models.dao.PessoaDAO;
import dao.JdbcDaoManager;

public class PessoaManagerImpl implements PessoaManager {
    @Override
    public Pessoa Cadastrar(Pessoa pessoa) {
        IDaoManager manager = new JdbcDaoManager();
        try {
            System.out.println("PESSOA NA DAO: " + pessoa);
            manager.iniciar();
            PessoaDAO dao = manager.getPessoaDAO();
            dao.inserir(pessoa);
            manager.confirmarTransação();
            manager.encerrar();
            return pessoa;
        } catch (Exception ex) {
            manager.abortarTransação();
            throw ex;
        }
    }
    
}
