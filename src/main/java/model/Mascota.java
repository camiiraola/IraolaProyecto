package model;

public class Mascota {
	int id;
	String nombre;
	String raza;
	
	
	public Mascota(int id, String nombre, String raza) {
		this.nombre = nombre;
		this.raza = raza;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nuevoNombre){
		this.nombre = nuevoNombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	
}
