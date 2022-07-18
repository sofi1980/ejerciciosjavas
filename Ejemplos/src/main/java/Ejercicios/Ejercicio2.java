//asiganar a una variable llamada edad y luego segun ... colocar un mesnsaje de edad

//0-10 bebe
//11-12 niño
//13-20 adolescente
package Ejercicios;


public class Ejercicio2 {
    
    
    public static void main(String[] args) {
        
        int edad=18;
        
        if (edad>=0 && edad<=10) {
            
            System.out.println("es un bb");
            
        }
        else if (edad>=11 && edad<=12) {
            System.out.println("es niño");
            
        }
        else if (edad>=13 && edad<=20) {
            
            System.out.println("es adolescente");
        }
        
        
    }
    
}
