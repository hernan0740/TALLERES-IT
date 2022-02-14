package com.taller.dao;

import java.util.Scanner;

import com.taller.dao.impl.AlumnosImpl;
import com.taller.dao.impl.MateriasImpl;

public class Menu  {

	Scanner teclado= new Scanner(System.in);
	private MateriasImpl materia = new MateriasImpl();
	private AlumnosImpl alumno = new AlumnosImpl();
	
	public Menu() {}
					
	
	
	
	public void  Menualumnos() {
		
		boolean primeravez=true;	
		int seguir=0;
			
		while (seguir!=1) 
			
		{	
			
				
			
			System.out.println("\n" +"Bienvenido al menú ALUMNOS, por favor seleccione la actividad a ejecutar: "
					+  "\n" + "\n" + "1. Registrar"+ "\n" + "2. Actualizar "+ "\n" + "3. Listar"+ "\n" + "4. Listar por materia "+ "\n" +"5. Eliminar"+"\n" + "6. Salir"+ "\n");
			
			int n = teclado.nextInt();
			
			
			if (primeravez == true)
		    {
		        
				alumno.menumetodos(n);
				if(n<1 || n>5) {
					System.out.println("Opcion invalida");
						
							}
				primeravez = false;
				
		    } 
			
		System.out.println("\n" +"Seleccionar: "+ "\n" +"\n" +"1.Menu ALUMNOS"+"\n" +"2.Menu principal");
				
				int reset = teclado.nextInt();
			
		    if (reset == 1) {
		        
		        primeravez = true;
		        }	
		    if (reset==2){
		    	seguir=1;
		    	
		    	
		    	}	
		}
	
	
	
			
			
		
	
	}
		

	public void  Menumaterias() {
		
		boolean primeravez=true;	
		int seguir=0;
			
		while (seguir!=1) 
			
		{	
			teclado= new Scanner(System.in);
			System.out.println("Bienvenido al menú MATERIAS, por favor seleccione la actividad a ejecutar: "
					+ "\n" + "\n" + "1. Registrar"+ "\n" + "2. Actualizar "+ "\n" + "3. Listar"+ "\n" + "4. Eliminar"+ "\n" + "5. Salir"+ "\n");
			
			int n = teclado.nextInt();
			
			if (primeravez == true)
		    {
		        
				materia.menumetodos(n);
				if(n<1 || n>5) {
					System.out.println("Opcion invalida");
						
							}
				primeravez = false;
				
		    } 
			
		System.out.println("\n" +"Seleccionar: "+ "\n" +"\n" +"1.Menu MATERIAS"+"\n" +"2.Menu principal");
				
				int reset = teclado.nextInt();
			
		    if (reset == 1) {
		        
		        primeravez = true;
		        }	
		    if (reset==2){
		    	seguir=1;
		    	
		    	
		    	}	
		}
	
	
	
	
	
		
		
	
    
	


}
	

}
