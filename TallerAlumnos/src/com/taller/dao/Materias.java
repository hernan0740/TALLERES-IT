package com.taller.dao;





public class Materias {

	
	private String nombre;
	private String turno;
	
	
	public Materias() {
		
	}
	
	public Materias(String nombre, String turno) {
		
		this.nombre = nombre;
		this.turno = turno;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTurno() {
		return turno;
	}







	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Materias [nombre=" + nombre + ", turno=" + turno + "]";
	}







	
	

	





}
