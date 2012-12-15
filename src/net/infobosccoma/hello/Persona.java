package net.infobosccoma.hello;

import java.io.Serializable;

import android.os.Bundle;

public class Persona implements Serializable {
	private String nomCognoms;
	private String email;
	private String telefon;
	
	public Persona() {
		
	}
	
	
	public Persona(String nomCognoms, String email, String telefon) {
		super();
		this.nomCognoms = nomCognoms;
		this.email = email;
		this.telefon = telefon;
	}

	public String getNomCognoms() {
		return nomCognoms;
	}
	public void setNomCognoms(String nomCognoms) {
		this.nomCognoms = nomCognoms;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	


}
