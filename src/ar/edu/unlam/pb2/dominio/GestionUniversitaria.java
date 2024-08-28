package ar.edu.unlam.pb2.dominio;

import java.util.ArrayList;
import java.util.List;

public class GestionUniversitaria {

	private List<Persona> personas;

//	private List<Alumno> alumnos;
//	private List<Docente> docentes;
//	private List<Administrativo> administrativos;

	public GestionUniversitaria() {
		this.personas = new ArrayList<>();

//		this.alumnos = new ArrayList<>();
//		this.docentes = new ArrayList<>();
//		this.administrativos = new ArrayList<>();
	}

	public Boolean agregar(Persona persona) {
		return this.personas.add(persona);
	}

	public List<Alumno> obtenerAlumnos() {

//		for(int i = 0; i < this.personas.size(); i++) {
//			
//			this.personas.get(i).getNombre();
//		}

		List<Alumno> alumnos = new ArrayList<>();

		// Foreach
		for (Persona persona : this.personas) {

			if (persona instanceof Alumno) {
				alumnos.add((Alumno) persona);
			}
		}

		return alumnos;
	}

//	public Boolean agregar(Alumno alumno) {
//		return this.alumnos.add(alumno);
//	}
//
//	public Boolean agregar(Docente docente) {
//		return this.docentes.add(docente);
//	}
//
//	public Boolean agregar(Administrativo administrativo) {
//		return this.administrativos.add(administrativo);
//	}

}
