package fabrique;

import java.util.ArrayList;
import java.util.Collection;

import domaine.Logiciel;

public class FabLogiciel {
	
	private static FabLogiciel instance;
	private static ArrayList<Logiciel> logiciels;
		
		public static FabLogiciel getinstance(){
			
			if(instance == null){
				instance = new FabLogiciel();
				logiciels = new ArrayList<Logiciel>();
			}
			return instance;

	}
		
		public Logiciel creerLogiciel(String nom){
			Logiciel log = new Logiciel(nom);
			logiciels.add(log);
			return log;
		}

		public static ArrayList<Logiciel> getLogiciels() {
			return logiciels;
		}
		
		public Logiciel getLogByName(String name)
		{
			Logiciel log = null;
				for(int i=0;i<logiciels.size();i++) {
							if(logiciels.get(i).getNom().equals((String)name)) {
								log=logiciels.get(i);
								break;
							}
							
				}
				return log;
		}
}
