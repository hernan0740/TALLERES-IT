package com.taller.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import com.taller.dao.Alumnos;

import database.Conexion;


public  class dBImplAlumno  {

	
	public void save(Alumnos alumno) {

		Conexion conex = new Conexion();

		try {
			// El objeto estatuto mantiene la sesion y me sirve para procesar sentencial SQL y obtener lo
			// resultados de la misma
			Statement estatuto = conex.getConnection().createStatement();
			
			estatuto.execute("INSERT INTO alumnos (nombre,apellido,matricula,idm) VALUES ('"
					+ alumno.getNombre() + "','" + alumno.getApellido() + "','"
					+ alumno.getMatricula() + "','" + alumno.getIdm() + "')");
			System.out.println("Se ha Registrado Exitosamente a " + alumno.getNombre()+" "+ alumno.getApellido());

			estatuto.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println( "no se registro a " + alumno.getNombre());
		} /*finally {
			try {
				conex.getConnection().close();
			} catch (SQLException e) {
				e.printStackTrace();
			}*/
		}
		
	public void update(Alumnos alumno,int idprueba) {
		

	Conexion conex = new Conexion();

		try {
			
			Statement estatuto = conex.getConnection().createStatement();

			estatuto.execute("UPDATE alumnos SET "
					+ "nombre='"+alumno.getNombre()
					+"',apellido='" + alumno.getApellido() 
					+ "',matricula='"+ alumno.getMatricula()
					+ "',idm='" + alumno.getIdm() 
					+"' where id='"+idprueba+"' ");
			

			System.out.println( "Se ha modificado exitosamente a " + alumno.getNombre()+"  "+ alumno.getApellido());

			estatuto.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println( "no se ha modificado exitosamente a " + alumno.getNombre()+"  "+ alumno.getApellido());
		} 
	
		
	}

	public void listSearch(int idbusqueda) {
		
		//Realizamos la consulta sql para mostrar todos los datos de la tabla alumnos
		
       ResultSet r = buscar("SELECT id,nombre,apellido FROM alumnos WHERE idm='"+idbusqueda+"'");
       ResultSet r2 = buscar("SELECT nombre,turno FROM materias WHERE id='"+idbusqueda+"'");

		try {
			
			while (r2.next()) {
			 System.out.println("\n SE MUESTRAN TODOS LOS REGISTROS DE LA MATERIA "+r2.getString("nombre")+":\n");
					
			 }		
			while (r.next()) {
               
                System.out.println(r.getInt("id") + " | " + r.getString("nombre") + " | " + r.getString("apellido"));
            }
			
			}catch (SQLException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("no se realizo la consulta " );
		
		}
	}
	
	public void listAllMateria() {
			
			ResultSet r;
			ResultSet r2;
	        //Realizamos la consulta sql para mostrar todos los datos de la tabla estudiante

			try {
				
				r2 = buscar("SELECT id,nombre,turno FROM materias ");			
				String acumulado="";	
					 System.out.println("\n SE MUESTRAN TODOS LOS REGISTROS DE ALUMNOS:\n");
				while (r2.next()) {
					r = buscar("SELECT id,nombre,apellido,idm FROM alumnos ");
					
					while (r.next() ) {
											
		             if(r2.getInt("id")==r.getInt("idm")) {
		            	 acumulado=r.getInt("id") + " | " + r.getString("nombre") + " | " + r.getString("apellido")+"\n"+acumulado;
		            		                
		            }
					}
					if(acumulado!="") {
						
						System.out.println("Alumnos matriculados en la materia " + r2.getString("nombre")+"\n"+acumulado);
						
					}
					
				acumulado="";				
				}
			

		}catch (SQLException e) {
			
		
			e.printStackTrace();
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "no se registro a " );
			
			
			
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
	    		System.out.println( "No se pudo realizar la busqueda  " );
	        }
	        return null;

	    }	
		
	public void delete(int id) {
		
		Conexion conex = new Conexion();

		try {
			
			Statement estatuto = conex.getConnection().createStatement();
			
			estatuto.execute("DELETE FROM alumnos where id='"+id+"' ");
			System.out.println("Se ha eliminado Exitosamente ");

			//estatuto.execute("ALTER TABLE  alumnos AUTO_INCREMENT='"+1+"' ");
			
			estatuto.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println( "no se ha eliminado " );
		} 
		
		
		
	}

	
	public void listAll() {
		
		ResultSet r;
        //Realizamos la consulta sql para mostrar todos los datos de la tabla estudiante

		try {
			
		
			r = buscar("SELECT id,nombre,apellido,idm FROM alumnos ");
			 System.out.println("\n A CONTINUACION SE MUESTRAN TODOS LOS ALUMNOS REGISTRADOS:\n");
			
			while (r.next()) {
             
                System.out.println("ID: "+r.getInt("id") + " | "+"NOMBRE: " + r.getString("nombre") + " " + r.getString("apellido")
                + "  |    COD-MATERIA:  " + r.getString("idm"));
            }


	}catch (SQLException e) {
		
	
		e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println( "No se pudo realizar la consulta " );
		
		
		
		}
	}

}
