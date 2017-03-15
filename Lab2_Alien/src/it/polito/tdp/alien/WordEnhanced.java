package it.polito.tdp.alien;
import java.util.*;

public class WordEnhanced {
	private String alienWord;
	private List<String> traduzioni=new LinkedList<String>();
	
	
	public WordEnhanced(String alienWord) {
		super();
		this.alienWord = alienWord;//chiave
		
	}
	
	
	
	public String getAlienWord() {
		return alienWord;
	}



	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}


	public void setTraduzioneIn(String traduzione){
		this.traduzioni.add(traduzione);
	}



	public boolean compare(String alienWord){
		return this.alienWord.equals(alienWord);
		
	}



	public List<String> getTraduzioni() {
		return traduzioni;
	}
	
	
	
	
	

}
