package ar.edu.unlam.pb2.dominio;

public class Persona {
	
	private String nombre;
	private String apellido;
	private Integer edad;
	private String correo;
	
	public Persona(String nombre, String apellido, Integer edad, String correo){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.correo = correo;
	}
	
	public Double obtenerSueldo() {
		return 100000D;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}
