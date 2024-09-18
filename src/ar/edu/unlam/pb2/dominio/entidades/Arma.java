package ar.edu.unlam.pb2.dominio.entidades;

public class Arma implements Comparable<Arma> {

	private Long id;
	private String nombre;

	public void setId(long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int compareTo(Arma armaParaComparar) {
//		return armaParaComparar.getNombre().compareTo(this.getNombre()); // Para comparar por nombre
		return this.getId().compareTo(armaParaComparar.getId());
	}

}
