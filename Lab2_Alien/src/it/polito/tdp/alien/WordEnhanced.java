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
		return this.alienWord.matches(alienWord);
		
	}



	public List<String> getTraduzioni() {
		return traduzioni;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienWord == null) ? 0 : alienWord.hashCode());
		return result;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WordEnhanced other = (WordEnhanced) obj;
		if (alienWord == null) {
			if (other.alienWord != null)
				return false;
		} else if (!alienWord.equals(other.alienWord))
			return false;
		return true;
	}
	
	
	
	
	

}
