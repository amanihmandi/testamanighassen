package fabrique;

import java.util.*;

import domaine.Machine;

public class FabMachine {
	
	
private static FabMachine instance;
private static ArrayList<Machine> machines;
	
	public static FabMachine getinstance(){
		
		if(instance == null){
			instance = new FabMachine();
			machines = new ArrayList<Machine>();
		}
		return instance;

}
	
	public Machine creerMachine(String nom){
		Machine mach = new Machine(nom) ;
		machines.add(mach);
		return mach ;
	}
	
	public Machine creerMachine(Machine machi){
		return machi;
	}

	public static ArrayList<Machine> getMachines() {
		return machines;
	}
	
	
	public Machine getMacByName(String name)
	{
		Machine mac = null;
			for(int i=0;i<machines.size();i++) {
						if(machines.get(i).getNomMachine().equals((String)name)) {
							mac=machines.get(i);
							break;
						}
						
			}
			return mac;
	}
	
	
	
}