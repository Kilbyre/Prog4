package br.pucpr.prog4.loja.controller;

import br.pucpr.prog4.loja.models.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClienteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/ClienteForm.jsp");
        rd.forward(request, response);
        
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        Cliente c = new Cliente();
        c.setTipoPessoa(request.getParameter("tipoCliente"));
        c.setNomeCliente(request.getParameter("nomeCliente"));
        c.setSexo(request.getParameter("sexo"));
        c.setComentarios(request.getParameter("comentarios"));
        
        c.setCPF(Integer.parseInt(request.getParameter("CPF")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            c.setDataNascimento(sdf.parse(request.getParameter("dataNascimento")));
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
