package it.polito.tdp.alien;
import java.util.*;

public class AlienDictionary {
	private List<Word> dizionario=new LinkedList<Word>();
	
	
	
	public AlienDictionary() {
		super();
	}

	public void addWord(String alienWord, String translation){
		boolean trovato=false;
		if(dizionario.size()!=0){
		for(Word wtemp:dizionario){
			trovato=wtemp.compare(alienWord);
			if(trovato==true){
				wtemp.setTranslation(translation);
			}
		}
		}
		if(trovato==false)
			dizionario.add(new Word(alienWord,translation));
		
			
	}
	
	public String translateWord(String alienWord){
		String risultato=null;
		for(Word wtemp:dizionario){
			if(wtemp.compare(alienWord))
				risultato=wtemp.getTranslation();
		}
		return risultato;
	}


}
