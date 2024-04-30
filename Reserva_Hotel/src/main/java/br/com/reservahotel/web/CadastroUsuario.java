package br.com.reservahotel.web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CadastrarUsuario")
public class CadastroUsuario extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public void doPost (HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
	
		System.out.println("Usuario:"+nome + "email" + email);
		doGet(request, response);
		
	}
	
	    public void doGet (HttpServletRequest request,
	    		HttpServletResponse response) throws ServletException, IOException {
	    	RequestDispatcher rd = request
	    	.getRequestDispatcher("sucesso.html");
	    	rd.forward(request, response);
	    }
	    
}


