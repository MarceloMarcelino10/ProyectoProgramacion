package logico;

public class Paciente extends Persona {
	
	private Vivienda miVivienda;
	private HistoriaClinica miHistoria;
	private String TipoSangre;
	
	public Paciente(String codigo, String cedula, String nombre, String apellidos,String TipoSangre, String genero, Vivienda miVivienda,
			HistoriaClinica miHistoria) {
		super(codigo, cedula, nombre, apellidos, genero);
		this.miVivienda = miVivienda;
		this.miHistoria = miHistoria;
		this.TipoSangre	= TipoSangre;
		}

	public Vivienda getMiVivienda() {
		return miVivienda;
	}

	public void setMiVivienda(Vivienda miVivienda) {
		this.miVivienda = miVivienda;
	}

	public HistoriaClinica getMiHistoria() {
		return miHistoria;
	}

	public void setMiHistoria(HistoriaClinica miHistoria) {
		this.miHistoria = miHistoria;
	}

	public String getTipoSangre() {
		return TipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		TipoSangre = tipoSangre;
	}
}
