
package clasesyobjetos;


public class Principal {
    public static void main(String[] args) {
        
        //instanciar
        Operacion op= new Operacion();
        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarDatos();
    }
}