package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.protobuf.ServiceException;

import Domain.Carrusel;
import Domain.CarruselImpl;

@WebServlet("/ListadoImagen")
public class ListadoImagenesServlet extends HttpServlet{


	CarruselImpl saveUsuario=new CarruselImpl();
		
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			ArrayList<Carrusel> listado;
			
			try {
				
				listado = saveUsuario.listadoImg();
				String prueba=listado.toString();
				System.out.println(prueba);
				//guardar el listado en  "request"
				req.setAttribute("Imagenes", listado);
				//continuar a la otra pagina y entregar la lista de articulos
				getServletContext().getRequestDispatcher("/ListarImagenes.jsp").forward(req, resp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
