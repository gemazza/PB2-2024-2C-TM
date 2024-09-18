package ar.edu.unlam.pb2.dominio.servicios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ar.edu.unlam.pb2.dominio.ArmaService;
import ar.edu.unlam.pb2.dominio.entidades.Arma;

public class ArmaServiceImplTest {
	
	private ArmaService armaService;
	
	@Before
	public void inicializacion() {
		this.armaService = new ArmaServiceImpl();
	}

	@Test
	public void dadoQueExisteUnServicioDeArmasCuandoAgregoUnArmaEntoncesSeEncuentraUnArmaEnLaColeccion() {
		
		// Presentacion -> interactua con el usuario -> entrada y salida de la info
		// Dominio -> El negocio y sus reglas
		// Infraestructura -> Cómo se guardan los datos
		
		// Preparacion -> Dado que
		Arma arma = new Arma();

		// Ejecucion -> Cuando
		Boolean armaAgregada = this.armaService.agregar(arma);
		
		// Vericacion -> Entonces
		List<Arma> armasObtenidas = this.armaService.obtener();
		int cantidadDeArmasEsperada = 1;
		
		assertTrue(armaAgregada);
		assertEquals(cantidadDeArmasEsperada, armasObtenidas.size());
	}
	
	@Test
	public void dadoQueExisteUnServicioDeArmasCuandoAgregoTresArmasEntoncesSeEncuentroTresArmasEnLaColeccion() {
		
		// Presentacion -> interactua con el usuario -> entrada y salida de la info
		// Dominio -> El negocio y sus reglas
		// Infraestructura -> Cómo se guardan los datos
		
		// Preparacion -> Dado que
		Arma arma = new Arma();
		arma.setId(1L);
		arma.setNombre("Espada");
		Arma otraArma = new Arma();
		otraArma.setId(2L);
		otraArma.setNombre("Escudo");

		// Ejecucion -> Cuando
		armaService.agregar(arma);
		armaService.agregar(arma);
		armaService.agregar(otraArma);
		
		// Vericacion -> Entonces
		List<Arma> armasObtenidas = this.armaService.obtener();
		int cantidadDeArmasEsperada = 3;
		
		assertEquals(cantidadDeArmasEsperada, armasObtenidas.size());
	}
}
