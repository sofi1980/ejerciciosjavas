package primerProyecto;
import java.util.Scanner;

public class PersonalServicio extends Empleado {
	Scanner teclado;
	String seccion,traslado;
	
	void seccionAsignada() {
		try {
			System.out.print("Ingrese la seccion asignada para el empleado: ");
			seccion=teclado.next();
		} catch(Exception e) {
			System.out.println("Se deben ingresar caracteres alfabeticos");
		}
	}
	
	void trasladoSeccion() {
		try {
			System.out.print("Confirmar que realmente solicita el traslado de sección s/n: ");
			traslado=teclado.next();
		} catch(Exception e) {
			System.out.print("Se deben ingresar caracteres alfabeticos");
		} finally {
			if (traslado.equals("s")) {
				System.out.print("Ingrese la nueva área asignada para el empleado: ");
				seccion=teclado.next();
			}
		}
	}
	
	void imprimirSeccion() {
		System.out.print("El área de trabajo asignada es: " + seccion);
	}
	
	public static void main (String[] args) {
		PersonalServicio empleadoServicio1;
		empleadoServicio1 = new PersonalServicio();
		empleadoServicio1.cargarDatos();
		empleadoServicio1.obtenerDatos();
		empleadoServicio1.imprimirDatos();
		empleadoServicio1.seccionAsignada();
		empleadoServicio1.trasladoSeccion();
		empleadoServicio1.imprimirSeccion();
	}
}
