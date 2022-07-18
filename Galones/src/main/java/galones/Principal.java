
package galones;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) 
    {
        Scanner scangalones = new Scanner(System.in);//captura
        double galones=0,valorgalonli;//declara varaible
        System.out.println("digite nro de galones");//solicita los datos
        galones = scangalones.nextDouble();//guarda en galones med
       
        valorgalonli = galones*3.785;
        System.out.println("el valor es = " + valorgalonli);
        
    }
}
