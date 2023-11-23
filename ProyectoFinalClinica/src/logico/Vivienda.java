package logico;

import java.util.ArrayList;

public class Vivienda {
	
	private String codigo;
	private ArrayList<Persona> misPersonas;
	private String direccion;
	public Vivienda(String codigo, String direccion) {
		super();
		this.codigo = codigo;
		this.misPersonas = new ArrayList<Persona>();
		this.direccion = direccion;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public ArrayList<Persona> getMisPersonas() {
		return misPersonas;
	}
	public void setMisPersonas(ArrayList<Persona> misPersonas) {
		this.misPersonas = misPersonas;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
