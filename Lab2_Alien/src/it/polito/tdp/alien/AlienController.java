package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */


import java.util.*;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	private AlienDictionary atemp= new AlienDictionary();
	private boolean primaVolta=true;
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
    @FXML
    private Button btnRicerca;
    @FXML
    private TextField txtRicerca;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	if(primaVolta){
    		txtResult.clear();
    	}
    	primaVolta=false;
    	String[] result =txtWord.getText().toLowerCase().split(" ");
    	// sol alternativa usare StringTokenizer
    	//StringTokenizer st= new StringTokenizer(riga," ");
    	
    	if(result.length==1){
    		
    		if(result[0].matches("[A-Za-z]*")){
    			LinkedList<String> ltemp=new LinkedList<String>(atemp.translateWord(result[0]));
    			for(String stemp:ltemp){
    				txtResult.appendText(stemp+"\n");
    			}
    		}
    		else
    			txtResult.appendText("Formato traduzione errato!\n");
    	}
    	
    	if(result.length==2)   {
    		if(result[0].matches("[A-Za-z]*") && result[1].matches("[A-Za-z]*") ){
    			atemp.addWord(result[0], result[1]);
    		}
    		else
    			txtResult.appendText("Formato aggiunta errato!\n");
    		
    	}
    	
    	if(result.length!=2 && result.length!=1)
    		txtResult.appendText("Inserite trpoppe parole!\n");
    	
    	txtWord.clear();
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	txtResult.clear();
    	}
    

    @FXML
    void doRicerca(ActionEvent event) {
    	String stemp=txtRicerca.getText().toLowerCase();
    	stemp=stemp.replaceAll("\\?", ".");
    	LinkedHashSet<String> listone=new LinkedHashSet<String>();
    	for(WordEnhanced etemp: atemp.getDizionario()){
    		if(etemp.compare(stemp)){
    			LinkedList<String> ltemp=new LinkedList<String>(atemp.translateWord(etemp.getAlienWord()));
    			for(String s:ltemp){
    				
    			     listone.add(s);
    			}
    	  }
    	} 
    	for(String s: listone){
			txtResult.appendText(s+"\n");
    		}
    }
    
}
