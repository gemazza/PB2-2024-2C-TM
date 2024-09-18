package ar.edu.unlam.pb2.dominio;

import java.util.Set;

import ar.edu.unlam.pb2.dominio.entidades.Arma;
import ar.edu.unlam.pb2.dominio.entidades.Guerrero;

public interface GuerreroService extends BaseService<Guerrero> {
//	Boolean agregar(Guerrero guerrero);

	Set<Guerrero> obtener();

	Boolean agregarArma(Long idGuerrero, Arma escudo);

	Set<Arma> obtenerArmas(Guerrero guerrero);
}
