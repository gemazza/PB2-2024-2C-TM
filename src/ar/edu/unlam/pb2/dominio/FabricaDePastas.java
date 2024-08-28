package ar.edu.unlam.pb2.dominio;

import java.util.ArrayList;

public class FabricaDePastas {

	// Coleccion: elemento que contiene muchos elementos
	// ArrayList
	
	//private Pasta[] pastas;
	private ArrayList<Pasta> pastas;

	public FabricaDePastas() {
		// this.pastas = new Pasta[5];
		this.pastas = new ArrayList<>();
	}

	public Boolean agregar(Pasta pasta) {
		return this.pastas.add(pasta);
	}

	public ArrayList<Pasta> obtenerPastas() {
		return this.pastas;
	}

}
