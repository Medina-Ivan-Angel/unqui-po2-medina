package ar.edu.unq.po2.tp8.ElementosSimilares;

import java.util.List;

public abstract class Filtro {

	
	public abstract List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> listaPaginas);
	
	public abstract boolean condicionDeFiltrado(WikipediaPage page1, WikipediaPage page2);
	
}
