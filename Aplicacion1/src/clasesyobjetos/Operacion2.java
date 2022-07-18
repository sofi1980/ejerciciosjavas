//parametros 

package clasesyobjetos;

import javax.swing.JOptionPane;

public class Operacion2 {
  
    
public int sumar(int numero1,int numero2){
    int suma=numero1 + numero2;
    return suma;
}
public int  restar(int numero1,int numero2){
    int resta=numero1 - numero2;
    return resta;
}
public  int multiplicar(int numero1,int numero2){
   int  multi=numero1 * numero2;
    return multi;
}
public int dividir(int numero1,int numero2){
   int  divi=numero1 / numero2;
    return divi;
}

public void mostrarDatos(int suma, int resta,int divi,int multi){
    System.out.println("la suma es : "+ suma);
    System.out.println("la resta es : "+ resta);
    System.out.println("la multiplicacion  es : "+ multi);
    System.out.println("la division es : "+ divi);
          
}
 
}
