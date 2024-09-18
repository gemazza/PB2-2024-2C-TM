package ar.edu.unlam.pb2.dominio.servicios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Set;
import org.junit.Before;
import org.junit.Test;

import ar.edu.unlam.pb2.dominio.GuerreroService;
import ar.edu.unlam.pb2.dominio.entidades.Arma;
import ar.edu.unlam.pb2.dominio.entidades.Guerrero;

public class GuerreroServiceImplTest {

	private GuerreroService guerreroService; 
	
	@Before
	public void inicializacion() {
		this.guerreroService = new GuerreroServiceImpl();
	}
	
	@Test
	public void dadoQueExisteUnGuerreroServiceCuandoAgregoUnGuerreroEntoncesLoEncuentoEnLaColeccion() {
		Guerrero guerrero = new Guerrero();
		
		Boolean agregado = this.guerreroService.agregar(guerrero);
		
		assertTrue(agregado);
	}
	
	@Test
	public void dadoQueExisteUnGuerreroServiceCuandoAgregoDosGuerrerosRepetidosEntoncesEncuentoEnLaColeccionSoloUno() {
		Guerrero guerrero = new Guerrero();
		guerrero.setId(1L);
		
		Boolean primerGuerreroAgregado = this.guerreroService.agregar(guerrero);
		Boolean segundoGuerreroAgregado = this.guerreroService.agregar(guerrero);
		
		Set<Guerrero> guerreros = this.guerreroService.obtener();
		
		int cantidadEsperada = 1;
		assertTrue(primerGuerreroAgregado);
		assertFalse(segundoGuerreroAgregado);
		assertEquals(cantidadEsperada, guerreros.size());
	}
	
	@Test
	public void dadoQueExisteUnGuerreroCuandoAgregoTresArmasConDosRepetidasEntoncesAlObtenerlasReciboDosArmasSinRepetirOrdenadasPorSuIdNaturalmente() {
		Guerrero guerrero = new Guerrero();
		guerrero.setId(1L);
		Arma espada = new Arma();
		espada.setId(1L);
		espada.setNombre("Espada");
		Arma escudo = new Arma();
		escudo.setId(2L);
		escudo.setNombre("Escudo");
		this.guerreroService.agregar(guerrero);

		Boolean primeraArmaAgregada = this.guerreroService.agregarArma(guerrero.getId(), escudo);
		Boolean segundaArmaAgregada = this.guerreroService.agregarArma(guerrero.getId(), espada);
		Boolean terceraArmaAgregada = this.guerreroService.agregarArma(guerrero.getId(), espada);
		
		Guerrero mismoGuerrero = new Guerrero();
		mismoGuerrero.setId(1L);
		
		Set<Arma> armasDelGuerrero = this.guerreroService.obtenerArmas(mismoGuerrero);
		
		int cantidadDeArmasEsperada = 2;
		assertTrue(primeraArmaAgregada);
		assertTrue(segundaArmaAgregada);
		assertFalse(terceraArmaAgregada);
		assertEquals(cantidadDeArmasEsperada, armasDelGuerrero.size());

		int indice = 0;
		for(Arma arma : armasDelGuerrero) {
			
			if(indice == 0) {
				assertEquals(espada, arma);
			} else if(indice == 1) {
				assertEquals(escudo, arma);
			}
			
			indice++;
		}
	}
}
