/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.loja.models;

import java.util.*;

/**
 *
 * @author renan.campos
 */
public class ProdutoManager implements IProdutoManager{
    
    public List<Produto> obterProdutos(){
        List<Produto> produtos = new ArrayList<Produto>();
        
        Produto p1 = new Produto(1, "Cafeteira", 50.);
        Produto p2 = new Produto(2, "Camera", 2000.);
        Produto p3 = new Produto(3, "Placa De Video", 500.);
        
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        
        return produtos;
    }
    
}
