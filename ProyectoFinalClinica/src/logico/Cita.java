package logico;

import java.util.Date;

public class Cita {
	
	private String codigo;
	private Persona miPersona;
	private Doctor miDoctor;
	private Date fechaCita;
	public Cita(String codigo, Persona miPersona, Doctor miDoctor) {
		super();
		this.codigo = codigo;
		this.miPersona = miPersona;
		this.miDoctor = miDoctor;
		this.fechaCita = new Date();
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Persona getMiPersona() {
		return miPersona;
	}
	public void setMiPersona(Persona miPersona) {
		this.miPersona = miPersona;
	}
	public Doctor getMiDoctor() {
		return miDoctor;
	}
	public void setMiDoctor(Doctor miDoctor) {
		this.miDoctor = miDoctor;
	}
	public Date getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(Date fechaCita) {
		this.fechaCita = fechaCita;
	}
	
//bien
}
