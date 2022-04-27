package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Conexion.GenericException;
import Domain.Carrusel;
import Domain.CarruselImpl;

@WebServlet("/CarrouselServlet")
public class CarrouselServlet extends HttpServlet {
	
	

	CarruselImpl saveUsuario=new CarruselImpl();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ArrayList<Carrusel> listado;
		try {
			listado = saveUsuario.listadoImg();
			String prueba=listado.toString();
			System.out.println(prueba);
			//guardar el listado en  "request"
			req.setAttribute("Listado", listado);
			//continuar a la otra pagina y entregar la lista de articulos
			getServletContext().getRequestDispatcher("/home.jsp").forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	
}
