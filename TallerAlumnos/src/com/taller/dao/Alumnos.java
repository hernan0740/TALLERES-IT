package com.taller.dao;




public class Alumnos {
	
	
	
	private String nombre;
	private String apellido;
	private int matricula;
	int idm;
	
	
	public Alumnos() {
		
	}
	
	
	public Alumnos(String nombre, String apellido, int matricula, int idm) {
	
	
		this.nombre = nombre;
		this.apellido = apellido;
		this.matricula = matricula;
		this.idm=idm;
		
	}
	
	

	public int getIdm() {
		return idm;
	}

	public void setIdm(int idm) {
		this.idm = idm;
	}

	

	@Override
	public String toString() {
		return "---[ nombre=" + nombre + ", apellido=" + apellido + ", matricula=" + matricula
				+ "]";
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	

}
