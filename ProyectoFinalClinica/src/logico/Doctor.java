package logico;

public class Doctor extends Persona {
	
	private String especialidad;
	boolean enServicio = false;
	
	public Doctor(String codigo, String cedula, String nombre, String apellidos, String genero, String user,
			String password, String especialidad, boolean enServicio) {
		super(codigo, cedula, nombre, apellidos, genero, user, password);
		this.especialidad = especialidad;
		this.enServicio = enServicio;
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
