package ar.edu.unlam.pb2.dominio;

public class Docente extends Persona {
	
	private Integer legajo;

	public Docente(String nombre, String apellido, Integer edad, String correo, Integer legajo) {
		super(nombre, apellido, edad, correo);
		this.legajo = legajo;
		this.getNombre();
	}
	
	@Override
	public Double obtenerSueldo() {
		return super.obtenerSueldo() * 1.2 + 50000;
	}
}
