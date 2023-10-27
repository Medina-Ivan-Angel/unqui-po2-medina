package ar.edu.unq.po2.tp8.ElementosSimilares;

import java.util.ArrayList;
import java.util.List;

public class MismaLetraInicial extends Filtro {

	@Override
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> listaPaginas) {
		
		List<WikipediaPage> listaResultado = new ArrayList<WikipediaPage>();
		
		for(WikipediaPage pagina : listaPaginas) {
			
			if(condicionDeFiltrado(page, pagina)) {
				listaResultado.add(pagina);
			}
			
		}
		return listaResultado;
	}

	@Override
	public boolean condicionDeFiltrado(WikipediaPage page1, WikipediaPage page2) {
		//Devolver true si las iniciales de ambas paginas son iguales
		return page1.getTitle().charAt(0) == page2.getTitle().charAt(0);
	}


}
