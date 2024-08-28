package ar.edu.unlam.pb2.dominio;

public class Administrativo extends Persona {
	
	private String horario;

	public Administrativo(String nombre, String apellido, Integer edad, String correo, String horario) {
		super(nombre, apellido, edad, correo);
		this.horario = horario;
	}
	
	@Override
	public Double obtenerSueldo() {
		return super.obtenerSueldo() * 1.3;
	}
}
