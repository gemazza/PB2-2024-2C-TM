package ar.edu.unlam.pb2.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class FabricaDePastasTest {
	
	private FabricaDePastas fabricaDePastas;
	
	@Before
	public void inicializacion() {
		this.fabricaDePastas = new FabricaDePastas();
	}
	
	// Registrar pasta: agrega una pasta a la coleccion de pastas disponibles para agregar a un pedido
	
	@Test
	public void dadoQueExisteUnaFabricaDePastasCuandoAgregoUnaPastaALaColeccionDePastasDisponiblesLaColeccionContieneLaPasta() {
		// Preparacion
		Pasta pasta = new Pasta();
		
		// Ejecucion
		Boolean pastaAgregada = this.fabricaDePastas.agregar(pasta);
		
		// Verificacion
		assertTrue(pastaAgregada);
	}
	
	@Test
	public void dadoQueExisteUnaFabricaDePastasCon2PastasCuandoLasObtengoLaColeccionObtenidaContiene2Elementos() {
		// Preparacion
		Pasta ravioles = new Pasta();
		Pasta agnolotis = new Pasta();
		this.fabricaDePastas.agregar(ravioles);
		this.fabricaDePastas.agregar(agnolotis);

		// Ejecucion
		ArrayList<Pasta> pastasObtenidas = this.fabricaDePastas.obtenerPastas();
		
		// Verificacion
		int cantidadEsperada = 2;
		assertEquals(cantidadEsperada, pastasObtenidas.size());
	}
	
}
