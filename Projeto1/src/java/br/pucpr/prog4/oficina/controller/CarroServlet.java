package br.pucpr.prog4.oficina.controller;
import br.pucpr.prog4.oficina.models.Carro;
import br.pucpr.prog4.oficina.models.CarroManagerImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class CarroServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/CarroForm.jsp");
        rd.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
            
        Carro c = new Carro();
        c.setPlaca(request.getParameter("placa"));
        c.setTipo(request.getParameter("tipo"));
           
        CarroManagerImpl cmi = new CarroManagerImpl();
        cmi.Cadastrar(c);
            
    }

}
