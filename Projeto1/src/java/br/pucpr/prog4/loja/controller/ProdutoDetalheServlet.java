package br.pucpr.prog4.loja.controller;
import br.pucpr.prog4.loja.models.IProdutoManager;
import br.pucpr.prog4.loja.models.Produto;
import br.pucpr.prog4.loja.models.ProdutoManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProdutoDetalheServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        IProdutoManager manager = new ProdutoManager();
        Produto produtoEscolhido = manager.obterPorId(id);
        System.out.print(produto);
        if(produtoEscolhido == null){
            request.setAttribute("msg","Erro, produto não encontrado");
            request.getRequestDispatcher("/WEB-INF/jsp/produtos-lista.jsp").forward(request, response);
        }else{
            request.setAttribute("produtoEscolhido", produtoEscolhido);
        request.getRequestDispatcher("/WEB-INF/jsp/produtos-lista.jsp").forward(request, response);
        }
        
        
        
    }
}
