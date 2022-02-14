package com.taller.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import com.taller.dao.Materias;
import database.Conexion;

public class dBImplMateria {


	public void save(Materias materia) {
		
	
			Conexion conex = new Conexion();
			
			try {
				// El objeto estatuto me sirve para procesar sentencial SQL y obtener lo
				// resultados de la misma
				Statement estatuto = conex.getConnection().createStatement();

				estatuto.execute("INSERT INTO materias (nombre,turno) VALUES ('"
						+ materia.getNombre()+ "','" + materia.getTurno()+"')");
				
				System.out.println( "Se ha Registrado Exitosamente a " + materia.getNombre());

				estatuto.close();

			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("no se registro a " + materia.getNombre());
			} 
		
		
		
		
	}

	public void update(Materias materia,int idprueba) {
		
		Conexion conex = new Conexion();

		try {
			
			Statement estatuto = conex.getConnection().createStatement();

			estatuto.execute("UPDATE materias SET nombre='"+materia.getNombre()+
					"', turno='" + materia.getTurno() + 	
					"' where id='"+idprueba+"' ");
			System.out.println( "Se ha modificado exitosamente la materia " + materia.getNombre()+"Informacion");

			estatuto.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println( "no se ha modificado la materia " + materia.getNombre()+"Informacion");
		} 
		
		
		
	}

	public void listAll() {
		ResultSet r;
        //Realizamos la consulta sql para mostrar todos los datos de la tabla estudiante

		try {
			
		
			r = buscar("SELECT id,nombre,turno FROM materias ");
			 System.out.println("\n A CONTINUACION SE MUESTRAN TODOS LOS REGISTROS DE LA MATERIAS:\n");
			
			while (r.next()) {
             
                System.out.println(r.getInt("id") + " | " + r.getString("nombre") + " | " + r.getString("turno"));
            }


	}catch (SQLException e) {
		
	
		e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println("No se pudo realizar la consulta " );
		
		
		
		}
		
	}

	ResultSet buscar(String sql) {
		
		Conexion conex = new Conexion();
		try {
		Statement estatuto = conex.getConnection().createStatement();
        
           
            return estatuto.executeQuery(sql);
        } catch (SQLException e) {
    		e.printStackTrace();
    		System.out.println(e.getMessage());
    		JOptionPane.showMessageDialog(null, "no se registro a " );
        }
        return null;

    }	
	
	public void delete(int id) {
		
		Conexion conex = new Conexion();

		try {
			
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.execute("DELETE FROM materias where id='"+id+"' ");
			System.out.println( "Se ha eliminado Exitosamente ");

			estatuto.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println( "no se ha eliminado " );
		} 
		
		
		
	}
	

}
