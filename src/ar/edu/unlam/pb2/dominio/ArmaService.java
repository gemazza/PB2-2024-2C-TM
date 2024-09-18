package ar.edu.unlam.pb2.dominio;

import java.util.List;

import ar.edu.unlam.pb2.dominio.entidades.Arma;

public interface ArmaService extends BaseService<Arma> {

//	Boolean agregar(Arma arma);

	List<Arma> obtener();

}
