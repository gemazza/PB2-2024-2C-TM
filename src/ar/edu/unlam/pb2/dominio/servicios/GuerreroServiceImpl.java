package ar.edu.unlam.pb2.dominio.servicios;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.pb2.dominio.GuerreroService;
import ar.edu.unlam.pb2.dominio.entidades.Arma;
import ar.edu.unlam.pb2.dominio.entidades.Guerrero;

public class GuerreroServiceImpl implements GuerreroService {
	private Set<Guerrero> guerreros;
	
	public GuerreroServiceImpl() {
		this.guerreros = new HashSet<>();
	}
	
	@Override
	public Boolean agregar(Guerrero guerrero) {
		return this.guerreros.add(guerrero);
	}

	@Override
	public Set<Guerrero> obtener() {
		return this.guerreros;
	}

	@Override
	public Boolean agregarArma(Long idGuerrero, Arma arma) {
		Boolean armaAgregada = false;
		
		for(Guerrero guerrero : this.guerreros) {
			if(guerrero.getId().equals(idGuerrero)) {
				armaAgregada = guerrero.add(arma);
			}
		}
		
		return armaAgregada;
	}

	@Override
	public Set<Arma> obtenerArmas(Guerrero guerrero) {
		Set<Arma> armas = null;
		
		for(Guerrero g : this.guerreros) {
			if(g.equals(guerrero)) {
				armas = g.getArmas();
			}
		}
		
		return armas;
	}
}
