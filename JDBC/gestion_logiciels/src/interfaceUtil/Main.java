package interfaceUtil;

import metier.Metier;
import fabrique.FabLicence;
import fabrique.FabLogiciel;
import fabrique.FabMachine;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("debut.");
		
		FabMachine fabmach = FabMachine.getinstance();
		FabLicence fablic = FabLicence.getinstance();
		FabLogiciel fablog = FabLogiciel.getinstance();
		
		Metier met = new Metier();
		
		
		for(int i=0;i<5;i++)
		fabmach.creerMachine("PC"+i);
		
		for(int i=0;i<5;i++)
			System.out.println(fabmach.getMachines().get(i).getNomMachine());
		
		fablog.creerLogiciel("word");
		fablog.creerLogiciel("excel");
		fablog.creerLogiciel("acess");
		
		for(int i=0;i<3;i++)
			System.out.println(fablog.getLogiciels().get(i).getNom());
		
		
		//licences word
		
		
		fablic.creerLicence(1,fablog.getLogByName("word"),fabmach.getMacByName("PC0"));
		fablic.creerLicence(2,fablog.getLogByName("word"),fabmach.getMacByName("PC1"));
		fablic.creerLicence(3,fablog.getLogByName("word"),fabmach.getMacByName("PC2"));
		fablic.creerLicence(4,fablog.getLogByName("word"),fabmach.getMacByName("PC3"));
		fablic.AfficherLicences();
		
		
		met.getMachineByLogiciel(fablog.getLogByName("word"));
		

	}

}
