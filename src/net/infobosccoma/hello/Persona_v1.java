package net.infobosccoma.hello;

import android.os.Bundle;

public class Persona_v1 {
	private String nomCognoms;
	private String email;
	private String telefon;
	
	public Persona_v1() {
		
	}
	
	
	public Persona_v1(String nomCognoms, String email, String telefon) {
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
	
	public Bundle toBundle() {
		Bundle b = new Bundle();
		
		b.putString("nomCognoms", this.nomCognoms);
		b.putString("email", this.email);
		b.putString("telefon", this.telefon);
		
		return null;
		
	}

	public static Persona_v1 fromBundle(Bundle b) {
		Persona_v1 p = new Persona_v1();
		
		p.setNomCognoms(b.getString("nomCognoms"));
		p.setEmail(b.getString("email"));
		p.setTelefon(b.getString("telefon"));

		return p;	
	}

}
