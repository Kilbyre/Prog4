/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.loja.models;

/**
 *
 * @author renan.campos
 */
public class Produto {
    
    private Integer idProduto;
    private String nomeProduto;
    private Double precoProduto;

    public Produto() {}
    public Produto(Integer idProduto, String nomeProduto, Double precoProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }
    public Integer getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public Double getPrecoProduto() {
        return precoProduto;
    }
    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }
    @Override
    public String toString() {
        return "Produto{" + "idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + ", precoProduto=" + precoProduto + '}';
    }
    
}
