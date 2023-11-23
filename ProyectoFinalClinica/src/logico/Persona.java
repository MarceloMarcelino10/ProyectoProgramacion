package logico;

import java.util.Date;

public class Persona {
	
	private String codigo;
	private String cedula;
	private String nombre;
	private String apellidos;
	private Date fechaNacimiento;
	private String genero;
	
	public Persona(String codigo, String cedula, String nombre, String apellidos, String genero) {
		super();
		this.codigo = codigo;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = new Date();;
		this.genero = genero;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}
