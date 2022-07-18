import areaDeTrabajo.AreaDeTrabajo;
import oficinista.Oficinista;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class demo {
    static List<Oficinista> oficinistas = new ArrayList<>();
    static List<AreaDeTrabajo> areasDeTrabajo = new ArrayList<>();

    public static void main(String[] args) {


        boolean seguir = true;

        while(seguir){
            int opcion = 0;
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija una opcion" + "\n" +
                        "1. añadir oficinista" + "\n" + "2. añadir espacio de trabajo" + "\n" + "3. mostrar oficinistas" + "\n" + "4. salir"));

                if (opcion > 4){
                    throw new Exception();
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "ingrese un valor valido");
            }


            if (opcion == 1){
                String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del oficinista");
                int cedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar la cedula del oficinista"));
                Oficinista nuevoOficinista = new Oficinista(nombre, cedula);
                oficinistas.add(nuevoOficinista);
            }

            if (opcion == 2){
               int codigo_area = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese codigo de area"));
                AreaDeTrabajo nuevaAreaDeTrabajo = new AreaDeTrabajo(codigo_area);
                areasDeTrabajo.add(nuevaAreaDeTrabajo);

                String añadirOficinista = JOptionPane.showInputDialog(null, "Desea asignar un oficinista?" + "\n" +
                        "1. si" + "\n" + "2. no");
                Oficinista oficinistaAAsignar = asignarOficinista(añadirOficinista);
                nuevaAreaDeTrabajo.asignarEmpleado(oficinistaAAsignar);

            }
            if (opcion ==3){
                for (Oficinista oficinista: oficinistas){
                    JOptionPane.showMessageDialog(null, oficinista.toString());
                }
            }

            if (opcion == 4){
                seguir = false;
                JOptionPane.showMessageDialog(null, "Adios");
            }
        }
    }

    public static Oficinista asignarOficinista(String opcion){
        if (opcion.equals("1")){
            for (Oficinista empleado : oficinistas){
                String asignar = JOptionPane.showInputDialog(null, empleado.toString() + "\nasignar?" + "\n" +
                        "1. si" + "2. no");
                if (asignar.equals("1")){
                    return empleado;
                }
                if (asignar.equals("2")){
                    continue;
                }
            }
        }
        return null;
    }
}
