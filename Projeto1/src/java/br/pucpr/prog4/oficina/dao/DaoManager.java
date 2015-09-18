/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.oficina.dao;

import br.pucpr.prog4.loja.models.dao.*;

/**
 *
 * @author renan.campos
 */
public interface DaoManager {
    void iniciar();
    void encerrar();
    void confirmarTransação();
    void abortarTransação();
    CarroDAO getCarroDAO();
}
