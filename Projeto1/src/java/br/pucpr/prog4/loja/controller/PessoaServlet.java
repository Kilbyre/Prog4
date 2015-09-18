package br.pucpr.prog4.loja.controller;

import br.pucpr.prog4.loja.models.Pessoa;
import br.pucpr.prog4.loja.models.PessoaManagerImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PessoaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/ClienteForm.jsp");
        rd.forward(request, response);
        
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        Pessoa p = new Pessoa();
        p.setTipoPessoa(request.getParameter("tipoPessoa"));
        p.setNomePessoa(request.getParameter("nomePessoa"));
        p.setSexo(request.getParameter("sexo"));
        p.setComentarios(request.getParameter("comentarios"));
        
        
        p.setCPF(Integer.parseInt(request.getParameter("CPF")));
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            p.setDataNascimento(sdf.parse(request.getParameter("dataNascimento")));
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("PESSOA SERVLET");
        PessoaManagerImpl pmi = new PessoaManagerImpl();
        pmi.Cadastrar(p);
        
    }
    
}
