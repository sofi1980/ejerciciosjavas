
package ejemplo;

import java.util.Scanner;


public class Ejemplo{
 
public static void main(String args[]) {
System.out.println("Escribe el Titulo");
Scanner consola = new Scanner(System.in);
String usuario = consola.nextLine();
 
System.out.println("Escribe el autor");
String titulo = consola.nextLine();
System.out.println(usuario + " " + " fue escrito por " + titulo);
 
}
}