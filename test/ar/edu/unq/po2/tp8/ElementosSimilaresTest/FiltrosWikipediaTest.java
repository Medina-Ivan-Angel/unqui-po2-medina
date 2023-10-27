package ar.edu.unq.po2.tp8.ElementosSimilaresTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp8.ElementosSimilares.LinkEnComun;
import ar.edu.unq.po2.tp8.ElementosSimilares.MismaLetraInicial;
import ar.edu.unq.po2.tp8.ElementosSimilares.Page;
import ar.edu.unq.po2.tp8.ElementosSimilares.PropiedadEnComun;
import ar.edu.unq.po2.tp8.ElementosSimilares.WikipediaPage;

class FiltrosWikipediaTest {
	
	
	Page pagina1;
	Page pagina2;
	
	//Links
	Page paginaLink1;
	Page paginaLink2;
	Page paginaLink3;
	Page paginaLink4;
	Page paginaLink5;
	Page paginaLink6;
	Page paginaLink7;
	
	//Filtros
	MismaLetraInicial mli;
	LinkEnComun	lec;
	PropiedadEnComun pec;
	
	//Lista WikipediaPages
	List<WikipediaPage> listado;
	
	@BeforeEach
	void setUp() throws Exception {
		
		//Paginas a comparar
		pagina1 = new Page("Soogle");
		pagina2 = new Page("Microsoft");
		
		
		//Links
		paginaLink1 = new Page("Link1");
		paginaLink2 = new Page("Link2");
		paginaLink3 = new Page("Link3");
		paginaLink4 = new Page("Link4");
		paginaLink5 = new Page("Link5");
		paginaLink6 = new Page("PLink");
		paginaLink7 = new Page("SLink");
		
		
		//Añadimos los links a las paginas
		pagina1.addLink(paginaLink1);
		pagina1.addLink(paginaLink2);
		pagina1.addLink(paginaLink3);
		pagina1.addLink(paginaLink6);
		
		pagina2.addLink(paginaLink1);
		pagina2.addLink(paginaLink3);
		pagina2.addLink(paginaLink6);
		pagina2.addLink(paginaLink7);
		pagina2.addLink(paginaLink2);
		
		//Filtros
		mli = new MismaLetraInicial();
		lec = new LinkEnComun();
		pec = new PropiedadEnComun();
		
		//Lista wikipediaPages
		listado = new ArrayList<WikipediaPage>();
		
		listado.add(paginaLink1);
		listado.add(paginaLink2);
		listado.add(paginaLink3);
		listado.add(paginaLink4);
		listado.add(paginaLink5);
		listado.add(paginaLink6);
		listado.add(paginaLink7);
	}

	@Test
	void testMismaLetraInicial() {
		
		List<WikipediaPage> resultadoEsperado = new ArrayList<WikipediaPage>();
		resultadoEsperado.add(paginaLink7);
		
		assertEquals(resultadoEsperado, mli.getSimilarPages(pagina1, listado));
	}
	
	
	@Test
	void testLinkEnComun() {

		List<WikipediaPage> resultadoEsperado = new ArrayList<WikipediaPage>();
		resultadoEsperado.add(paginaLink1);
		resultadoEsperado.add(paginaLink2);
		resultadoEsperado.add(paginaLink3);
		resultadoEsperado.add(paginaLink6);
		
		assertEquals(resultadoEsperado, lec.getSimilarPages(pagina1, pagina2.getLinks()));
	}
	
	

}
