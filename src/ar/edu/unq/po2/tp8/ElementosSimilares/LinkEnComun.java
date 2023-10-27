package ar.edu.unq.po2.tp8.ElementosSimilares;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkEnComun extends Filtro {

	@Override
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> listaPaginas) {
		
		List<WikipediaPage> listaResultado = new ArrayList<WikipediaPage>();
		
		/* FEO
		for(WikipediaPage pagina : listaPaginas) {
			
			for(WikipediaPage link : page.getLinks()) {
				
				if(condicionDeFiltrado(link, pagina)) {
					listaResultado.add(pagina);
				}
			
			}
			
			
		}*/
		
		//No funka
		listaResultado = listaPaginas.stream()
	            .filter(page.getLinks()::contains)  // Filtra los elementos que están en ambas listas
	            .collect(Collectors.toList());
		
		return listaResultado;
	}

	@Override
	public boolean condicionDeFiltrado(WikipediaPage page1, WikipediaPage page2) {
		//Devolver true si las paginas son iguales
		return page1.equals(page2);
	}

}
