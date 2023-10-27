package ar.edu.unq.po2.tp8.ElementosSimilares;

import java.util.List;
import java.util.Map;

public interface WikipediaPage {


	//Metodos
	public String getTitle();
	
	public List<WikipediaPage> getLinks();
	
	public Map<String, WikipediaPage> getInfobox(); 
	
	
	
	
}
