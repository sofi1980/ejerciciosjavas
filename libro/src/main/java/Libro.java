import java.util.Scanner;
 
public class Libro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Escribe tu solucion aqui
        System.out.println("Proporciona el titulo:");
       var titulo = scanner.nextLine();
        System.out.println("Proporciona el autor:");
        var autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
      


