package primerProyecto;
import java.util.Scanner;

public class Estudiante extends MiembroFacultad {
	Scanner teclado;
	String[] cursos;
	String curso;
	int cantCursos;
	
	void cargarCursos() {
		teclado = new Scanner (System.in);
		System.out.print("Ingrese la cantidad de cursos que desea matricular: ");
		cantCursos=teclado.nextInt();
		cursos = new String[cantCursos];
		for (int i = 0; i < cantCursos; i++) {
			System.out.print("Ingrese el curso a matricular: ");
			cursos[i]=teclado.next();
		}
	}
	
	void imprimirCursos() {
		System.out.println("*Cursos matriculados por el estudiante*");
		for (int i = 0; i < cantCursos; i++) {
			System.out.println("- " + cursos[i]);
		}
	}
	
	public static void main(String[] args) {
		Estudiante estudiante1;
		estudiante1 = new Estudiante();
		estudiante1.cargarDatos();
		estudiante1.imprimirDatos();
		estudiante1.cambioEstadoCivil();
		estudiante1.cargarCursos();
		estudiante1.imprimirCursos();
	}
}
