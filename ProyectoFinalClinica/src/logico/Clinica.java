package logico;

import java.util.ArrayList;

public class Clinica {
	
	private ArrayList<Vivienda> misViviendas;
	private ArrayList<Persona> misPersonas;
	private ArrayList<Enfermedad> misEnfermedades;
	private ArrayList<Cita> misCitas;
	private ArrayList<Vacuna> misVacunas;
	private ArrayList<Consulta> misConsultas;
	private static Clinica clinica = null;
	public static int codPersona = 1;
	public static int codCita= 1;
	public static int codVacuna = 1;
	public static int codEnfermedad = 1;
	public static int codConsulta = 1;
	public static int codVivienda = 1;
	
	public Clinica() {
		super();
		this.misViviendas = new ArrayList<Vivienda>();
		this.misPersonas =  new ArrayList<Persona>();
		this.misEnfermedades =  new ArrayList<Enfermedad>();
		this.misCitas =  new ArrayList<Cita>();
		this.misVacunas =  new ArrayList<Vacuna>();
		this.misConsultas =  new ArrayList<Consulta>();
	}
	
	public static Clinica getInstance() {
		if (clinica == null) {
			clinica = new Clinica();
		}
		return clinica;
	}

	public ArrayList<Vivienda> getMisViviendas() {
		return misViviendas;
	}

	public void setMisViviendas(ArrayList<Vivienda> misViviendas) {
		this.misViviendas = misViviendas;
	}

	public ArrayList<Persona> getMisPersonas() {
		return misPersonas;
	}

	public void setMisPersonas(ArrayList<Persona> misPersonas) {
		this.misPersonas = misPersonas;
	}

	public ArrayList<Enfermedad> getMisEnfermedades() {
		return misEnfermedades;
	}

	public void setMisEnfermedades(ArrayList<Enfermedad> misEnfermedades) {
		this.misEnfermedades = misEnfermedades;
	}

	public ArrayList<Cita> getMisCitas() {
		return misCitas;
	}

	public void setMisCitas(ArrayList<Cita> misCitas) {
		this.misCitas = misCitas;
	}

	public ArrayList<Vacuna> getMisVacunas() {
		return misVacunas;
	}

	public void setMisVacunas(ArrayList<Vacuna> misVacunas) {
		this.misVacunas = misVacunas;
	}

	public ArrayList<Consulta> getMisConsultas() {
		return misConsultas;
	}

	public void setMisConsultas(ArrayList<Consulta> misConsultas) {
		this.misConsultas = misConsultas;
	}
}
