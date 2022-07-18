package primerProyecto;
import java.util.Scanner;

public class MiembroFacultad {
	Scanner teclado;
	String estadoCivil, nombreCompleto, cambioEstadoCivil;
	int numeroIdentificacion;
	boolean comprobacion = true;
	
	void cargarDatos() {
		teclado = new Scanner(System.in);
		try {
			System.out.print("Ingrese el nombre completo: ");
			nombreCompleto=teclado.next();
		} catch(Exception e) {
			System.out.println("Se deben ingresar caracteres alfabeticos");
		}
		try {
			System.out.print("Ingrese el numero de identificacion: ");
			numeroIdentificacion=teclado.nextInt();
		} catch(Exception e) {
			System.out.println("Se debe ingresar un valor numerico");
		}
		try {
			System.out.print("Ingrese el estado civil: ");
			estadoCivil=teclado.next();
		} catch(Exception e) {
			System.out.println("Se deben ingresar caracteres alfabeticos");
		}
	}
	
	void cambioEstadoCivil() {	
		teclado = new Scanner(System.in);
		try {
			System.out.print("¿Desea cambiar el estado civil ingresado s/n?: ");
			cambioEstadoCivil=teclado.next();
		} catch(Exception e) {
			System.out.print("Los caracteres ingresados no son alfabeticos");
		} finally {
			if (cambioEstadoCivil.equals("s")) {
				System.out.print("Ingrese el nuevo estado civil: ");
				estadoCivil=teclado.next();
			}
		}
	}
	
	void imprimirDatos() {
		System.out.println("--El nombre completo del miembro de la facultad es: " + nombreCompleto);
		System.out.println("--El numero de identificación del miembro de la facultad es: " + numeroIdentificacion);
		System.out.println("--El estado civil del miembro de la facultad es: " + estadoCivil);
	}
	
	public static void main (String[] args) {
		MiembroFacultad miembro;
		miembro = new MiembroFacultad();
		miembro.cargarDatos();
		miembro.imprimirDatos();
	}
}

