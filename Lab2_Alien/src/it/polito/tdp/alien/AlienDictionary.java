package it.polito.tdp.alien;
import java.util.*;

public class AlienDictionary {
	private List<WordEnhanced> dizionario=new LinkedList<WordEnhanced>();
	
	
	
	public AlienDictionary() {
		super();
	}
	
	

	public List<WordEnhanced> getDizionario() {
		return dizionario;
	}



	public void addWord(String alienWord, String translation){
		boolean trovato=false;
		if(dizionario.size()!=0){
		for(WordEnhanced wtemp:dizionario){
			trovato=wtemp.compare(alienWord);
			if(trovato==true){
				wtemp.setTraduzioneIn(translation);
			}
		}
		}
		if(trovato==false){
			WordEnhanced wetemp=new WordEnhanced(alienWord);
			dizionario.add(wetemp);
			wetemp.setTraduzioneIn(translation);
			
		}
		
			
	}
	
	public List<String> translateWord(String alienWord){
		List<String> risultato= new LinkedList<String>();
		for(WordEnhanced wtemp:dizionario){
			if(wtemp.compare(alienWord))
				risultato=wtemp.getTraduzioni();
		}
		return risultato;
	}


}
