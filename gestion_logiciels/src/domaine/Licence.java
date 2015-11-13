package domaine;

public class Licence {
	
	private int nLic;
	private Logiciel logiciel;
	private Machine machine;
	
	
	
	public Licence(int nLic, Logiciel logiciel) {
		this.nLic = nLic;
		this.logiciel = logiciel;
		machine = null;
	}
	
	public Licence(int nLic, Logiciel logiciel, Machine machine) {
		this.nLic = nLic;
		this.logiciel = logiciel;
		this.machine = machine;
	}


	public int getnLic() {
		return nLic;
	}


	public Logiciel getLogiciel() {
		return logiciel;
	}


	public Machine getMachine() {
		return machine;
	}

	public void setMachine(Machine machine) {
		this.machine = machine;
	}
	aaaaaaaaaaaaaaaaaaaaaa
	
	
	
	
	

}
