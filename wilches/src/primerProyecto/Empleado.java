package primerProyecto;
import java.util.Scanner;

public class Empleado extends MiembroFacultad {
	Scanner teclado;
	int a�oIncorporacion, numeroDespacho;
	
	void obtenerDatos() {
		System.out.print("Ingrese el a�o de incorporacion del empleado: ");
		a�oIncorporacion=teclado.nextInt();
		System.out.print("Ingrese el numero de despacho asignado: ");
		numeroDespacho=teclado.nextInt();
	}
}
