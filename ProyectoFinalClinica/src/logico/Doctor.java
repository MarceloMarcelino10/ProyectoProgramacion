package logico;

import java.util.ArrayList;

public class Doctor extends Persona {
	
	private String especialidad;
	boolean enServicio = false;
	private ArrayList<Paciente> pacientesTratados;
	private ArrayList<Consulta> consultasTratadas;
	
	public Doctor(String codigo, String cedula, String nombre, String apellidos, String genero, String user,
			String password, String especialidad, boolean enServicio) {
		super(codigo, cedula, nombre, apellidos, genero, user, password);
		this.especialidad = especialidad;
		this.enServicio = enServicio;
		this.pacientesTratados = new ArrayList<Paciente>();
		this.consultasTratadas = new ArrayList<Consulta>();
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
	
	//METODOS PARA INSERTAR:
	
	public void insertarPacienteTratado(Paciente paciente) {
		pacientesTratados.add(paciente);
	}
	
	public void insertarConsultaTratada(Consulta consulta) {
		consultasTratadas.add(consulta);
	}
	
	//METODOS PARA ELIMINAR:
	
	public void eliminarPacienteTratado(Paciente paciente) {
	    pacientesTratados.remove(paciente);
	}

	public void eliminarConsultaTratada(Consulta consulta) {
	    consultasTratadas.remove(consulta);
	}

	// METODOS PARA MODIFICAR:

	public void actualizarPacienteTratado(Paciente paciente) {
	    int index = buscarPacienteTratadoByCodigo(paciente.getCodigo());
	    pacientesTratados.set(index, paciente);
	}
	
	private int buscarPacienteTratadoByCodigo(String codigo) {
	    int index = -1;
	    boolean encontrado = false;
	    int i = 0;

	    while (!encontrado && i < pacientesTratados.size()) {
	        if (pacientesTratados.get(i).getCodigo().equalsIgnoreCase(codigo)) {
	            encontrado = true;
	            index = i;
	        }
	        i++;
	    }

	    return index;
	}

	public void actualizarConsultaTratada(Consulta consulta) {
	    int index = buscarConsultaTratadaByCodigo(consulta.getCodigo());
	    consultasTratadas.set(index, consulta);
	}
	
	private int buscarConsultaTratadaByCodigo(String codigo) {
	    int index = -1;
	    boolean encontrado = false;
	    int i = 0;

	    while (!encontrado && i < consultasTratadas.size()) {
	        if (consultasTratadas.get(i).getCodigo().equalsIgnoreCase(codigo)) {
	            encontrado = true;
	            index = i;
	        }
	        i++;
	    }

	    return index;
	}
}
