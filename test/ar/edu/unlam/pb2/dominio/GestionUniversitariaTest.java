package ar.edu.unlam.pb2.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class GestionUniversitariaTest {
	
	@Test
	public void dadoQueExisteUnaUniversidadPuedoAgregarUnAlumno() {
		
		// preparacion
		GestionUniversitaria gestionUniversitaria = new GestionUniversitaria();
		Persona alumno = new Alumno("Matias", "Alguno", 25, "mati@alguno.com", 15);
		
		// ejecucion
		Boolean agregado = gestionUniversitaria.agregar(alumno);
		
		// verificacion
		assertTrue(agregado);
	}
	
	@Test
	public void dadoQueExisteUnaUniversidadPuedoAgregarUnDocente() {
		
		// preparacion
		GestionUniversitaria gestionUniversitaria = new GestionUniversitaria();
		Persona docente = new Docente("Ger", "Alguno", 35, "ger@alguno.com", 111111);
		
		// ejecucion
		Boolean agregado = gestionUniversitaria.agregar(docente);
		
		// verificacion
		assertTrue(agregado);
	}
	
	@Test
	public void dadoQueExisteUnaUniversidadPuedoAgregarUnAdministrativo() {
		
		// preparacion
		GestionUniversitaria gestionUniversitaria = new GestionUniversitaria();
		Persona administrativo = new Administrativo("Juan", "Otro", 27, "aaa@alguno.com", "9 a 18");
		
		// ejecucion
		Boolean agregado = gestionUniversitaria.agregar(administrativo);
		
		// verificacion
		assertTrue(agregado);
	}
	
	@Test
	public void dadoQueExisteUnaUniversidadPuedoAgregarUnAdministrativoUnDocenteYUnAlumno() {
		
		// preparacion
		GestionUniversitaria gestionUniversitaria = new GestionUniversitaria();
		Persona administrativo = new Administrativo("Juan", "Otro", 27, "aaa@alguno.com", "9 a 18");
		Persona alumno = new Alumno("Matias", "Alguno", 25, "mati@alguno.com", 15);
		Persona docente = new Docente("Ger", "Alguno", 35, "ger@alguno.com", 111111);
		
		// ejecucion
		Boolean administrativoAgregado = gestionUniversitaria.agregar(administrativo);
		Boolean alumnoAgregado = gestionUniversitaria.agregar(alumno);
		Boolean docenteAgregado = gestionUniversitaria.agregar(docente);
		
		// verificacion
		assertTrue(administrativoAgregado);
		assertTrue(alumnoAgregado);
		assertTrue(docenteAgregado);
	}
	
	@Test
	public void dadoQueExisteUnaUniversidadConUnAdministrativoUnDocenteYUnAlumnoCuandoObtengoAlumnosEncuentroUno() {
		
		// preparacion
		GestionUniversitaria gestionUniversitaria = new GestionUniversitaria();
		Persona administrativo = new Administrativo("Juan", "Otro", 27, "aaa@alguno.com", "9 a 18");
		Persona alumno = new Alumno("Matias", "Alguno", 25, "mati@alguno.com", 15);
		Persona docente = new Docente("Ger", "Alguno", 35, "ger@alguno.com", 111111);
		gestionUniversitaria.agregar(administrativo);
		gestionUniversitaria.agregar(alumno);
		gestionUniversitaria.agregar(docente);
		
		// ejecucion
		List<Alumno> alumnos = gestionUniversitaria.obtenerAlumnos();
		
		// verificacion
		assertEquals(1, alumnos.size());
	}
	
	@Test
	public void dadoQueExisteUnaUniversidadConUnDocenteCuandoObtengoSuSueldoRecibo200000() {
//		GestionUniversitaria gestionUniversitaria = new GestionUniversitaria();
		Persona docente = new Docente("Ger", "Alguno", 35, "ger@alguno.com", 111111);
		
		Double sueldoObtenido = docente.obtenerSueldo(); 
		
		Double sueldoEsperado = 170000D;
		
		assertEquals(sueldoEsperado, sueldoObtenido);
	}

}
