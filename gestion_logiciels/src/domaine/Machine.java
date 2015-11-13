package domaine;

import java.util.*;

public class Machine {
	private String nomMachine;
	private Collection<Licence> licences;
	
	public Machine(String nomMachine) {
		this.nomMachine = nomMachine;
		
	}
	
	public Machine(String nomMachine, Collection<Licence> licences) {
		this.nomMachine = nomMachine;
		this.licences = licences;
	}
	
	public String getNomMachine() {
		return nomMachine;
	}
	public void setNomMachine(String nomMachine) {
		this.nomMachine = nomMachine;
	}
	public Collection<Licence> getLicences() {
		return licences;
	}
	public void setLicences(Collection<Licence> licences) {
		this.licences = licences;
	}
	
	
	
	

}
