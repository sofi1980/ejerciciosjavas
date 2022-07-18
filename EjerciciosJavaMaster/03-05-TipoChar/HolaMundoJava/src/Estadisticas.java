
import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class Estadisticas {

    int n;
    int edad[] = new int[n];
    float peso[] = new float[n];
    float medida[] = new float[n];

    public Estadisticas() {
    }

    public Estadisticas(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void llenarEdad() {
        for (int i = 0; i < n; i++) {
            edad[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite Valor de elementos de la posición en el valor [ " + i + " ] = "));
        }
    }

    public void mostraEdad() {
        for (int i = 0; i < n; i++) {
            System.out.println("Edad [ " + i + " ] = " + edad[i]);
        }
    }

    public static void main(String[] args) {
        Estadisticas obj = new Estadisticas();
        obj.llenarEdad();
    }

}
