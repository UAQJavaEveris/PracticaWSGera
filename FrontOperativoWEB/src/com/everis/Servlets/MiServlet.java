package com.everis.Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;
import javax.xml.ws.WebServiceRef;
import javax.xml.ws.spi.WebServiceFeatureAnnotation;

import mx.com.everis.TallerJava.service.Saludos;
import mx.com.everis.TallerJava.service.SaludosService;
import mx.com.everis.TallerJava.service.SaludosServiceLocator;
import mx.com.everis.tallerjava.service.Sumas;
import mx.com.everis.tallerjava.service.SumasService;

/**
 * Servlet implementation class MiServlet
 */
@WebServlet("/MiServlet")
public class MiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@WebServiceRef
	private SaludosService saludosService;
	
	@WebServiceRef
	private SumasService sumasService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String nombre = request.getParameter("nombre");
		SaludosServiceLocator serviceLocator = new SaludosServiceLocator();
		try {
			Saludos port = serviceLocator.getSaludosPort();
			port.getSaludoByName(nombre);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("El nombre es: " + nombre);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
