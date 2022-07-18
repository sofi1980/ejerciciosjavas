// pedi datos
package clasesyobjetos;

import javax.swing.JOptionPane;


public class principal2 
{
       public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("digite el valor uno "));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("digite el valor dos"));
        
        Operacion2 op= new Operacion2();
         int suma =op.sumar(n1, n2);
         int resta =op.restar(n1, n2);
         int multi =op.multiplicar(n1, n2);
         int div =op.dividir(n1, n2);
        //instanciar
        //op.sumar(n1, n2);
        //op.restar(n1, n2);
        //op.dividir(n1, n2);
        //op.multiplicar(n1, n2);
       // op.mostrarDatos(n2, n2, n2, n2);
    }
    }
            
    

