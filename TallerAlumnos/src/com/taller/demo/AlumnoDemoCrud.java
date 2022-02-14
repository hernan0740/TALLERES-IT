package com.taller.demo;
import java.util.Scanner;
import com.taller.dao.Menu;
public class AlumnoDemoCrud {

	public static void main(String[] args) {

		Menu menu=new Menu();
		boolean primeravez=true;	
		int seguir=0;
		
		
		
		while (seguir!=1) 
			
		{	
			try {
			
			Scanner teclado= new Scanner(System.in);
			System.out.println("Bienvenido al sistema de datos de la facultad, por favor seleccione sobre que "
					+ "entidad desea trabajar: "+ "\n" + "\n" +"1. ALUMNOS "+ "\n" + "2. MATERIAS ");
			
			int n = teclado.nextInt();
			
		if (primeravez == true)
	    {
	        
			if(n==1) {
				
				menu.Menualumnos();
				    }
			
			if(n==2) {
				
				menu.Menumaterias();
					}
			
			primeravez = false;
			
	    } 
	    
		System.out.println("\n" +"Seleccionar: "+ "\n" +"\n" +"1.Menu principal"+"\n" +"2.Terminar");
		
			int reset = teclado.nextInt();
		
	    if (reset == 1) {
	        
	        primeravez = true;
	        }	
	    if (reset==2){
	    	seguir=1;
	    	
	    	System.out.println("\n" +"_________GRACIAS POR UTILIZAR NUESTRO SERVICIO_______");
	    	}	
	   
		
			} catch(Exception e) {
				
				System.out.println("Error de digitacion");
				
				System.out.println("\n" +"Seleccionar: "+ "\n" +"\n" +"1.Menu principal"+"\n" +"2.Terminar");
				Scanner teclado= new Scanner(System.in);
				int reset = teclado.nextInt();
			
		    if (reset == 1) {
		        
		        primeravez = true;
		        }	
		    if (reset==2){
		    	seguir=1;
		    	
		    	System.out.println("\n" +"_________GRACIAS POR UTILIZAR NUESTRO SERVICIO_______");
		    	}	
			}
	   }
		
	}
	
	
}
