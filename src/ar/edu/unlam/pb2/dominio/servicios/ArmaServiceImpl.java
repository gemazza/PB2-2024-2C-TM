package ar.edu.unlam.pb2.dominio.servicios;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.pb2.dominio.ArmaService;
import ar.edu.unlam.pb2.dominio.entidades.Arma;

public class ArmaServiceImpl implements ArmaService {

	private List<Arma> armas;
	
	public ArmaServiceImpl() {
		this.armas = new ArrayList<>();
	}
	
	@Override
	public Boolean agregar(Arma arma) {
		return this.armas.add(arma);
	}

	@Override
	public List<Arma> obtener() {
		return this.armas;
	}

}
