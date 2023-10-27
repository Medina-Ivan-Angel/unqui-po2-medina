package ar.edu.unq.po2.tp8.ElementosSimilares;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Page implements WikipediaPage {
	
	//Atributos
	private String title;
	private List<WikipediaPage> links = new ArrayList<WikipediaPage>();
	
	//Constructor
	public Page(String title) {
		this.title = title;
	}
	
	//Metodos
	public void addLink(WikipediaPage pagina) {
		links.add(pagina);
	}
	
	
	
	//Getters and Setters
	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public List<WikipediaPage> getLinks() {
	
		return links;
	}

	@Override
	public Map<String, WikipediaPage> getInfobox() {
		// TODO Auto-generated method stub
		return null;
	}

}
