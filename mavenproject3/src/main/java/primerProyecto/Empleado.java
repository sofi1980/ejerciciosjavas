package primerProyecto;
import java.util.Scanner;

public class Empleado extends MiembroFacultad {
	Scanner teclado;
	int añoIncorporacion, numeroDespacho;
	
	void obtenerDatos() {
		try {
			System.out.print("Ingrese el a�o de incorporacion del empleado: ");
			añoIncorporacion=teclado.nextInt();
		} catch(Exception e) {
			System.out.println("Se debe ingresar un valor numerico");
		}
		try {
			System.out.print("Ingrese el numero de despacho asignado: ");
			numeroDespacho=teclado.nextInt();
		} catch(Exception e) {
			System.out.print("Se debe ingresar un valor numerico");
		}
	}
}
