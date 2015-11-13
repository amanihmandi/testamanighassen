package domaine;

import java.util.*;

public class Logiciel {
 private String nom;
 private ArrayList<Licence> licences;
 
 
public Logiciel(String nom) {

		this.nom = nom;
		
}
 
public Logiciel(String nom, ArrayList<Licence> licences) {

	this.nom = nom;
	this.licences = licences;
}

public String getNom() {
	return nom;
}




public ArrayList<Licence> getLicences() {
	return licences;
}





 
}
