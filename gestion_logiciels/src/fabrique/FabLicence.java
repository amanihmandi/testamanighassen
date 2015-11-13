package fabrique;

import java.util.ArrayList;
import java.util.Collection;

import domaine.Licence;
import domaine.Logiciel;
import domaine.Machine;

public class FabLicence {
	
	private static FabLicence instance;
	private static ArrayList<Licence> licences;
		
		public static FabLicence getinstance(){
			
			if(instance == null){
				instance = new FabLicence();
				licences = new ArrayList<Licence>();
			}
			return instance;

	}
		
		public Licence creerLicence(int numLic , Logiciel log,Machine mach){
			Licence lic = new Licence(numLic,log,mach);
			licences.add(lic);
			return lic;
		}
		
		public void affecterMachine  (Machine mach , Licence lic){
			if(licences.contains(lic))
			{
				Licence lic2 = licences.get(licences.indexOf((Licence)lic));
				lic2.setMachine(mach);
				licences.set(licences.indexOf((Licence)lic), lic2);
			}
			
			else
				System.out.println("ERREUR : Licence inexistante");
			
		}
		
		
		public  ArrayList<Licence> getLicences() {
			return licences;
		}
		
		public void AfficherLicences() {
			for(int i=0;i<licences.size();i++) {
				System.out.println("Machine : "+licences.get(i).getMachine().getNomMachine()+
						" Logiciel : "+licences.get(i).getLogiciel().getNom());
			}
		}

}
