package clasesyobjetos;
import javax.swing.JOptionPane;
public class Operacion {
    int numero1;
    int numero2;
    int suma;
    int resta;
    int divi;
    int multi;
//metodos
public void leerNumeros(){
    numero1=Integer.parseInt(JOptionPane.showInputDialog("digite nro uno"));//ventana emergente
    numero2=Integer.parseInt(JOptionPane.showInputDialog("digite nro dos"));
}
public void sumar(){
    suma=numero1 + numero2;
}
public void restar(){
    resta=numero1 - numero2;
}
public void multiplicar(){
    multi=numero1 * numero2;
}
public void dividir(){
    divi=numero1 / numero2;
}
public void mostrarDatos(){
    System.out.println("la suma es : "+ suma);
    System.out.println("la resta es : "+ resta);
    System.out.println("la multiplicacion  es : "+ multi);
    System.out.println("la division es : "+ divi);
        
}
}
