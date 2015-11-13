package metier;

import java.util.*;

import domaine.*;
import fabrique.FabLicence;
import fabrique.FabMachine;

public class Metier {
	 
	

	
		public ArrayList<Machine> getMachineByLogiciel(Logiciel log) {
			
			ArrayList<Machine> machines = null;
			FabLicence fablic = FabLicence.getinstance();
			ArrayList<Licence> licences = fablic.getLicences();
			
			int j = 0 ;
			for(int i=0;i<licences.size();i++ ) {
					if(licences.get(i).getLogiciel().getNom().equals((String)log.getNom())) {
					
						//erreur : null pointer exception
						machines.add(FabMachine.getinstance().creerMachine(licences.get(i).getMachine()));
						System.out.println(machines.get(j).getNomMachine());
						j++;
					}
			}
			return machines;
		}
}
