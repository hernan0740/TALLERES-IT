package com.taller.dao.impl;
import java.util.Scanner;
import com.taller.dao.Alumnos;




public  class AlumnosImpl extends Alumnos {

	
	

	Scanner teclado= new Scanner(System.in);
	MateriasImpl materia;
	Alumnos alumno;
	dBImplAlumno dBAlumnos=new dBImplAlumno();
	dBImplMateria dBMaterias=new dBImplMateria ();
	


	public void registroAlumno() {
		
		try {
		
				
		System.out.println("Digite nombre del estudiante: ");
		String nombre = teclado.next();
		
		System.out.println("Digite apellido del estudiante: ");
		String apellido = teclado.next();
		
		System.out.println("Digite codigo de la  matricula: ");
		int matricula = teclado.nextInt();
				
		System.out.println( "Las Materias disponibles son: "+"\n");
		dBMaterias.listAll();		
		System.out.println("Digite codigo de materia ");
		int idm = teclado.nextInt();
		alumno=new Alumnos(nombre,apellido,matricula,idm);
		
		
		
		System.out.println("Registro de alumno: "+"\n"+"\n"+"-- Nombre:  " +alumno.getNombre() +" "+alumno.getApellido());
		System.out.println("-------------------------------------------------");
		
		dBAlumnos.save(alumno);	
		
		
		
		
		} catch(Exception e) {
			System.out.println("Error de digitacion");
			
		}
		
				
	}
	
	
	public void modificarAlumno() {
		
		try {

		
		dBAlumnos.listAll();
			
		System.out.println( "Digite id de alumno  para modificar "+"\n" );	
		int idprueba = teclado.nextInt();
		
				
		
		System.out.println("\n" +"Digite nombre del estudiante: "+"\n");
		String nombre = teclado.next();
		
		System.out.println("\n" +"Digite apellido del estudiante: "+"\n");
		String apellido = teclado.next();
		
		System.out.println("\n" +"Digite codigo de la  matricula: "+"\n");
		int matricula = teclado.nextInt();
		
		System.out.println("\n" +"Digite codigo de la  materia: "+"\n");
		
		int idm= teclado.nextInt();
		
		alumno=new Alumnos(nombre,apellido,matricula,idm);
	 		
		dBAlumnos.update(alumno,idprueba);
	 		
	 					
		} catch(Exception e) {
			System.out.println("Error de digitacion");
			
		}
		
	}


	public void buscarPorMateria() {
		
		try {
			
		dBMaterias.listAll();
		System.out.println( "Seleccione codigo de Materia:"+"\n");
		int idbusqueda= teclado.nextInt();
		dBAlumnos.listSearch(idbusqueda);
		
		} catch(Exception e) {
			
			System.out.println("Error de digitacion");
		
		}
		
		
	}


	public void eliminarAlumno() {
		
	try {	
		
		dBAlumnos.listAll();
		System.out.println( "\n" +"Digite id de alumno a eliminar : "+"\n");
		Integer id = teclado.nextInt();
		dBAlumnos.delete(id);	
			
	} catch(Exception e) {
		System.out.println("Error de digitacion");
	}
}


	public void menumetodos(int w) {
		
		
		switch (w) {
		case 1: {registroAlumno();}break;
		case 2: {modificarAlumno();}break;
		case 3: {dBAlumnos.listAll();};break;
		case 4: {buscarPorMateria();}break;
		case 5: {eliminarAlumno();}break;	
		default:{};
		}
		
		
		
		
	}

	
	public  void metexception() throws Exception {
		
		
		throw new Exception ("Revisado");
	
	
	
}


	


	


}


	