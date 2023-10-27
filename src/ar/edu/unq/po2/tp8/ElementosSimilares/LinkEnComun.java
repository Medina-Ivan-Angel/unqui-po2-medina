package ar.edu.unq.po2.tp8.ElementosSimilares;

import java.util.ArrayList;
import java.util.List;

public class LinkEnComun extends Filtro {

	@Override
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> listaPaginas) {
		
		List<WikipediaPage> listaResultado = new ArrayList<WikipediaPage>();
		
		for(WikipediaPage pagina : listaPaginas) {
			
			for(WikipediaPage link : page.getLinks()) {
				
				if(condicionDeFiltrado(link, pagina)) {
					listaResultado.add(pagina);
				}
			
			}
			
			
		}
		return listaResultado;
	}

	@Override
	public boolean condicionDeFiltrado(WikipediaPage page1, WikipediaPage page2) {
		//Devolver true si las paginas son iguales
		return page1.equals(page2);
	}

}
