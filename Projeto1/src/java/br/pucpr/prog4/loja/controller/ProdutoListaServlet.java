package br.pucpr.prog4.loja.controller;

import br.pucpr.prog4.loja.models.IProdutoManager;
import br.pucpr.prog4.loja.models.Produto;
import br.pucpr.prog4.loja.models.ProdutoManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ProdutoListaServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        IProdutoManager PM = new ProdutoManager();
        List<Produto> produtos = PM.obterProdutos();
        request.setAttribute("produtos", produtos);
        request.getRequestDispatcher("/WEB-INF/jsp/produtos-lista").forward(request, response);
    }
    
}
