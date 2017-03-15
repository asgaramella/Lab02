package it.polito.tdp.alien;
import java.util.*;

public class Word {
	private String alienWord;
	private String translation;
	
	
	public Word(String alienWord, String translation) {
		super();
		this.alienWord = alienWord;//chiave
		this.translation = translation;
	}
	
	
	
	public String getAlienWord() {
		return alienWord;
	}



	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}



	public String getTranslation() {
		return translation;
	}



	public void setTranslation(String translation) {
		this.translation = translation;
	}



	public boolean compare(String alienWord){
		return this.alienWord.equals(alienWord);
		
	}
	
	
	
	

}
