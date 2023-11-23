package logico;

public class Enfermedad {
	
	private String codigo;
	private String nombre;
	private String sintomas;
	private String tratamiento;
	private int gravedad;
	
	public Enfermedad(String codigo, String nombre, String sintomas, String tratamiento, int gravedad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.sintomas = sintomas;
		this.tratamiento = tratamiento;
		this.gravedad = gravedad;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public int getGravedad() {
		return gravedad;
	}

	public void setGravedad(int gravedad) {
		this.gravedad = gravedad;
	}
}
