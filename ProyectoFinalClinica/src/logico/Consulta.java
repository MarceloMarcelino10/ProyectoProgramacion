package logico;

import java.util.ArrayList;
import java.util.Date;

public class Consulta {
	
	private String codigo;
	private ArrayList<Enfermedad> misEnfermedades;
	private Date fechaConsulta;
	
	public Consulta(String codigo) {
		super();
		this.codigo = codigo;
		this.misEnfermedades = new ArrayList<Enfermedad>();
		this.fechaConsulta = new Date();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public ArrayList<Enfermedad> getMisEnfermedades() {
		return misEnfermedades;
	}

	public void setMisEnfermedades(ArrayList<Enfermedad> misEnfermedades) {
		this.misEnfermedades = misEnfermedades;
	}

	public Date getFechaConsulta() {
		return fechaConsulta;
	}

	public void setFechaConsulta(Date fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}
}
