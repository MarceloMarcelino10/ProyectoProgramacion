package logico;

public class Doctor extends Persona {
	
	private String especialidad;
	boolean enServicio = false;
	
	public Doctor(String codigo, String cedula, String nombre, String apellidos, String genero, String especialidad) {
		super(codigo, cedula, nombre, apellidos, genero);
		this.especialidad = especialidad;
		this.enServicio = false;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public boolean isEnServicio() {
		return enServicio;
	}

	public void setEnServicio(boolean enServicio) {
		this.enServicio = enServicio;
	}
}
