/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operadores;

/**
 *
 * @author user
 */
public class ciclofor {
    public static void main(String[] args) {
        int suma=0,i;
        for(i=0; i<10;i+=i)
        {
            System.out.println("Numero:"+i);
               suma =suma+i;
        }
     
        System.out.println("la suma es"+suma);
    }
    
}
