package com.taller.dao.impl;
import java.util.Scanner;
import com.taller.dao.Materias;

public class MateriasImpl extends Materias {

	
	private Materias materia;
	Scanner teclado= new Scanner(System.in);
	private dBImplMateria dBMaterias=new dBImplMateria ();
	
	
	public void registroMateria() {
		
		try {
			
				
		System.out.println("Digite nombre de la materia: ");
		String nombre = teclado.next();
		
		System.out.println("Digite jornada mañana/tarde: ");
		String turno = teclado.next();
		
		materia=new Materias(nombre, turno);
		
		System.out.println("Registro de Materia: "+"\n Nombre:" +materia.getNombre() +" Jornada "+materia.getTurno());
		System.out.println("-------------------------------------------------");
		
		dBMaterias.save(materia);
		
		
		System.out.println("Registro de  Materia exitoso");		
		
		
		
		} catch(Exception e) {
			System.out.println("Error de digitacion");
			
		}
		
		
	
	}


	public void modificarMateria() {
		
		try {

		dBMaterias.listAll();;
			
		System.out.println( "Digite id de la materia para modificar "+"\n");	
		Integer idprueba = teclado.nextInt();
		
		System.out.println("Digite nombre de la materia: "+ "\n" );
		String nombre = teclado.next();
		
		System.out.println("Digite jornada de la materia mañana(m)/tarde(t): "+ "\n" );
		String turno = teclado.next();
		
		materia=new Materias(nombre, turno);
		
		dBMaterias.update(materia, idprueba);
	 		
	 	
		} catch(Exception e) {
			System.out.println("Error de digitacion");
			
		}
		
		
	}


	public void eliminarMateria() {
		
		
		
		try {	
			
			dBMaterias.listAll();
			System.out.println( "\n" +"Digite id de MATERIA a eliminar : "+"\n");
			Integer id = teclado.nextInt();
			dBMaterias.delete(id);	
					
		 
		
		} catch(Exception e) {
			System.out.println("Error de digitacion");
			
		}
	
				
	}

	
	public void menumetodos(int w) {
		
		
		switch (w) {
		case 1: {registroMateria();}break;
		case 2: {modificarMateria();}break;
		case 3: {dBMaterias.listAll();break;}
		case 4: {eliminarMateria();}break;	
		default:{};
		}
		
	}
		
		
	
		
					
}

