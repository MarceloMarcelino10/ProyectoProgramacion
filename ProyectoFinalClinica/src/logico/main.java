package logico;

public class main {

	public static void main(String[] args) {
		
		//Prueba de login:
		Doctor d = new Doctor("123", "123", "Maxi Emiliano", "Alegrie", "Masculino", "Milan", "123", "Cirujano Nocturno", true);
		Paciente p = new Paciente("12", "12", "Juan", "Perez", "Masculino", "juan", "juan123", null, null);
		
		Clinica.getInstance().insertarPersona(p);
		Clinica.getInstance().insertarPersona(d);
		
		if (Clinica.getInstance().iniciarSesion("milan", "123") != null) {
			System.out.println("Nombre del usuario ingresado: "+Clinica.getInstance().iniciarSesion("Milan", "123").getNombre());
        } else {
            System.out.println("El usuario no existe.");
        }
		
		if (Clinica.getInstance().iniciarSesion("juan", "juan123") != null) {
			System.out.println("Nombre del usuario ingresado: "+Clinica.getInstance().iniciarSesion("juan", "juan123").getNombre());
        } else {
            System.out.println("El usuario no existe.");
        }
		if (Clinica.getInstance().iniciarSesion("adAmin", "admin")!= null) {
			System.out.println("Nombre del usuario ingresado: "+Clinica.getInstance().iniciarSesion("admin", "admin").getNombre());
        } else {
            System.out.println("El usuario no existe.");
        }
	}
}
