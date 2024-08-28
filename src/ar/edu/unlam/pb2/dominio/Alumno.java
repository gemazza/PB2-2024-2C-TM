package ar.edu.unlam.pb2.dominio;

public class Alumno extends Persona {

	private Integer cantidadDeMaterias;

	public Alumno(String nombre, String apellido, Integer edad, String correo, Integer cantidadDeMaterias) {
		super(nombre, apellido, edad, correo);
		this.cantidadDeMaterias = cantidadDeMaterias;
	}

	@Override
	public Double obtenerSueldo() {
		return 0D;
	}
}
