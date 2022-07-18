package primerProyecto;
import java.util.Scanner;

public class Empleado extends MiembroFacultad {
	Scanner teclado;
	int añoIncorporacion, numeroDespacho;
	
	void obtenerDatos() {
		System.out.print("Ingrese el año de incorporacion del empleado: ");
		añoIncorporacion=teclado.nextInt();
		System.out.print("Ingrese el numero de despacho asignado: ");
		numeroDespacho=teclado.nextInt();
	}
}
