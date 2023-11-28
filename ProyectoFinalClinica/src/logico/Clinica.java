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
	private static Persona admin = new Persona("", "", "Administrador", "", "", "admin", "admin");
	
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

	//METODOS PARA INSERTAR EN LAS LISTAS:
	
    public void insertarVivienda(Vivienda vivienda) {
        misViviendas.add(vivienda);
        codVivienda++;
    }

    public void insertarPersona(Persona persona) {
        misPersonas.add(persona);
        codPersona++;
    }

    public void insertarEnfermedad(Enfermedad enfermedad) {
        misEnfermedades.add(enfermedad);
        codEnfermedad++;
    }

    public void insertarCita(Cita cita) {
        misCitas.add(cita);
        codCita++;
    }

    public void insertarVacuna(Vacuna vacuna) {
        misVacunas.add(vacuna);
        codVacuna++;
    }

    public void insertarConsulta(Consulta consulta) {
        misConsultas.add(consulta);
        codConsulta++;
    }
    
    //METODOS PARA ELIMINAR EN LAS LISTAS:
    
    public void eliminarVivienda(Vivienda vivienda) {
        misViviendas.remove(vivienda);
    }

    public void eliminarPersona(Persona persona) {
        misPersonas.remove(persona);
    }

    public void eliminarEnfermedad(Enfermedad enfermedad) {
        misEnfermedades.remove(enfermedad);
    }

    public void eliminarCita(Cita cita) {
        misCitas.remove(cita);
    }

    public void eliminarVacuna(Vacuna vacuna) {
        misVacunas.remove(vacuna);
    }

    public void eliminarConsulta(Consulta consulta) {
        misConsultas.remove(consulta);  
    }
    
    //METODOS PARA ACTUALIZAR EL ELEMENTO DE UNA LISTA:
	
    public void actualizarVivienda(Vivienda vivienda) {
    	int index = buscarViviendaByCode(vivienda.getCodigo());
    	misViviendas.set(index, vivienda);
    }
	
	private int buscarViviendaByCode(String codigo) {
		int index = -1;
		boolean encontrado = false;
		int i = 0;
		while (!encontrado && i < misViviendas.size()) {
			if (misViviendas.get(i).getCodigo().equalsIgnoreCase(codigo)) {
				encontrado = true;
				index = i;
			}
			i++;
		}	
		return index;
	}
	
	public void actualizarPersona(Persona persona) {
        int index = buscarPersonaByCode(persona.getCodigo());
            misPersonas.set(index, persona);
    }

    private int buscarPersonaByCode(String codigo) {
        int index = -1;
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i < misPersonas.size()) {
            if (misPersonas.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                encontrado = true;
                index = i;
            }
            i++;
        }    
        return index;
    }

    public void actualizarEnfermedad(Enfermedad enfermedad) {
        int index = buscarEnfermedadByCode(enfermedad.getCodigo());
            misEnfermedades.set(index, enfermedad);
    }

    private int buscarEnfermedadByCode(String codigo) {
        int index = -1;
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i < misEnfermedades.size()) {
            if (misEnfermedades.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                encontrado = true;
                index = i;
            }
            i++;
        }    
        return index;
    }

    public void actualizarCita(Cita cita) {
        int index = buscarCitaByCode(cita.getCodigo());
            misCitas.set(index, cita);
    }

    private int buscarCitaByCode(String codigo) {
        int index = -1;
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i < misCitas.size()) {
            if (misCitas.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                encontrado = true;
                index = i;
            }
            i++;
        }    
        return index;
    }

    public void actualizarVacuna(Vacuna vacuna) {
        int index = buscarVacunaByCode(vacuna.getCodigo());
            misVacunas.set(index, vacuna);
    }

    private int buscarVacunaByCode(String codigo) {
        int index = -1;
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i < misVacunas.size()) {
            if (misVacunas.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                encontrado = true;
                index = i;
            }
            i++;
        }    
        return index;
    }

    public void actualizarConsulta(Consulta consulta) {
        int index = buscarConsultaByCode(consulta.getCodigo());
            misConsultas.set(index, consulta);
    }

    private int buscarConsultaByCode(String codigo) {
        int index = -1;
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i < misConsultas.size()) {
            if (misConsultas.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                encontrado = true;
                index = i;
            }
            i++;
        }    
        return index;
    }

	//METODOS PARA EL LOGIN:
	
	public Persona iniciarSesion(String user, String password) {
		if(user.equals("admin") && password.equals("admin")) {
			return admin;
		}
		return buscarPersonaByUserAndPassword(user,password);
	}
	
	private Persona buscarPersonaByUserAndPassword(String user, String password) {
		Persona aux = null;
		boolean encontrado = false;
		int i = 0;
				
		while(i < misPersonas.size() && !encontrado) {
			if (misPersonas.get(i).getUser().equals(user) && misPersonas.get(i).getPassword().equals(password)) {
				aux = misPersonas.get(i);
				encontrado = true;
			}
			i++;
		}
		
		return aux;
	}
}
