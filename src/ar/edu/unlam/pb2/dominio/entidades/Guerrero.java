package ar.edu.unlam.pb2.dominio.entidades;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Guerrero {

	private Long id;
	private Set<Arma> armas;
	
	public Guerrero() {
		this.armas = new TreeSet<>();
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public Boolean add(Arma arma) {
		return this.armas.add(arma);
	}

	public Set<Arma> getArmas() {
		return this.armas;
	}

//	@Override
//	public int hashCode() { // A34asrRtasd
//		return Objects.hash(id);
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // misma instancia
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) // Compara por clase
			return false;
		Guerrero other = (Guerrero) obj;
		return Objects.equals(id, other.id);
	}
}
