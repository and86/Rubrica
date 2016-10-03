package rubrica;

import java.util.Map;
import java.util.TreeMap;

public class Rubrica {
	
	private Map<String,Voce> voci=new TreeMap<String,Voce>();	//TreeMap ordina
	
	public Voce aggiungiVoce(String nome,String cognome,String telefono) throws VoceGi‡Esiste{
		
		if(voci.containsKey(nome+" "+cognome)){
			throw new VoceGi‡Esiste("era dentro classe Rubrica metodo aggiungi");
		} 
		
		Voce v=new Voce(nome,cognome,telefono);
		voci.put(nome+" "+cognome, v);
		
		return v;
		
	}
	

}
