package servlet;

import java.io.IOException;
import java.sql.SQLException;
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

@WebServlet("/EditCarrouselServlet")
public class EditCarrouselServlet extends HttpServlet {
	
	

	CarruselImpl upImg=new CarruselImpl();
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ArrayList<Carrusel> listado;
		String urlEdit=req.getParameter("Urlimg");
		String desEdit=req.getParameter("desc");
		int codigoId = Integer.parseInt(req.getParameter("id"));
		Carrusel newImg=new Carrusel(codigoId,desEdit,urlEdit ,codigoId+1);
		System.out.println(newImg);
		
		if(urlEdit !=null) {

			try {		System.out.println("ingreso ");
						upImg.editSQL(newImg);
						System.out.println("modificado");
						listado = upImg.listadoImg();
						//guardar el listado en  "request"
						req.setAttribute("Imagenes", listado);
						//continuar a la otra pagina y entregar la lista de articulos
						getServletContext().getRequestDispatcher("/ListarImagenes.jsp").forward(req, resp);

					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
				}

	
}}
