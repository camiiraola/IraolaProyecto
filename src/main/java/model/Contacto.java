package model;

public class Contacto {
	int id;
	String nombre;
	String email;
	String comentario;

	

 public Contacto(int id, String nombre, String mail, String comentario) {
	 this.id = id;
	 this.nombre = nombre;
	 this.email = mail;
	 this.comentario = comentario;
 }



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getNombre() {
	return nombre;
}



public void setNombre(String nombre) {
	this.nombre = nombre;
}



public String getMail() {
	return email;
}



public void setMail(String mail) {
	this.email = mail;
}



public String getComentario() {
	return comentario;
}



public void setComentario(String comentario) {
	this.comentario = comentario;
}






















}
