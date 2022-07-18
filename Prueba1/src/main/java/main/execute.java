
package main;

import java.util.List;
import javax.swing.JOptionPane;
import oficinista.Oficinista;


public class execute {
    
    List<Oficinista> oficinistas;
    public static void main(String[] args) {
      
        
       // JOptionPane.showMessageDialog(null, "hola");
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        int cedula =Integer.parseInt(JOptionPane.showInputDialog(null, "digite cedula"));
        Oficinista nuevoOficinista =new Oficinista(nombre, cedula);
        System.out.println(nuevoOficinista.toString());
        
                }
}
