package primerProyecto;
import java.util.Scanner;

public class Profesor extends Empleado {
	Scanner teclado;
	String departamento, nuevoDepartamento;
	
	void departamentoAsignado() {
		System.out.print("Ingrese el departamento asignado: ");
		departamento=teclado.next();
	}
	
	void nuevoDepartamentoAsignado() {
		System.out.print("Confirme si desea cambiar el departamento asignado s/n: ");
		nuevoDepartamento=teclado.next();
		if (nuevoDepartamento.equals("s")) {
			System.out.print("Ingrese el nuevo departamento a asignar al empleado: ");
			departamento=teclado.next();
		}
	}
	
	public void imprimirDepartamento() {
		System.out.print("El departamento al cual estará asignado el profesor será " + departamento);
	}
	
	public static void main(String[] args) {
		Profesor profesor1;
		profesor1 = new Profesor();
		profesor1.cargarDatos();
		profesor1.imprimirDatos();
		profesor1.obtenerDatos();
		profesor1.departamentoAsignado();
		profesor1.imprimirDepartamento();
		
	}
}
