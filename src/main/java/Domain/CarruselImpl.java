package Domain;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Conexion.GenericException;
import Conexion.GetConnection;


public class CarruselImpl  extends Carrusel{
	
	
	
	
	public ArrayList<Carrusel> listadoImg() throws Exception{
		
		ArrayList<Carrusel> imagenes=new ArrayList<>();
		
		String sql  = "select * from carrusel";
		
		//connection
		try (Connection con = GetConnection.obtenerConexion();) {

			try (Statement st = con.createStatement()) {
				System.out.println("conectado");
				try (ResultSet res = st.executeQuery(sql)) {
					
					while (res.next())
					{
					Carrusel entity = new Carrusel();	
					entity.setActivo(res.getInt("activo"));
					entity.setDescripcion(res.getString("descripcion"));
					entity.setId(res.getInt("id"));
					entity.setImagen(res.getString("imagen"));
					
					imagenes.add(entity);

					
				}
			}
		}catch (Exception e) {			
			throw new Exception("No se pudo consultar:" +sql, e);
		}
		
		
		return imagenes;
	}
	
	

}
	

	public void editSQL(Carrusel newImg) throws GenericException, SQLException {
		
		String sql = "UPDATE carrusel "
				+ "SET descripcion='"+newImg.getDescripcion()+"',"
						+ "imagen='"+newImg.getImagen()+"' "
				+ "WHERE id='"+newImg.id+"'";
				
		
		try (Connection con = GetConnection.obtenerConexion();) {

			
			try (Statement st = con.createStatement()) {
				System.out.println("conectado");
				try (ResultSet res = st.executeQuery("SELECT id,descripcion,imagen FROM carrusel ")) {
	
				while (res.next()) {
				
				if(res.getInt("id")==newImg.id) {
					
					 st.execute(sql);
					
					 
				}
				
			}
				}
		
		
		}catch (Exception e) {
			
		
				
		}






}
	
}}
