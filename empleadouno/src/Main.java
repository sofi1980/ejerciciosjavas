
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
      private static java.util.List<Oficinista> oficinistas = new ArrayList<>();
      private static java.util.List<AreaTrabajo> areaTrabajos = new ArrayList<>();
            
      public static void main(String[] args) {
        boolean salir=false;
        
          while (!salir) {
              String mostrar=JOptionPane.showInputDialog(null,"Por favor agregue \n \n " +
                      "1. Agregar nuevo \n" +
                      "2. mostrar \n" +
                      "3. Asignar empleado a un area \n" +
                      "4. salir."
              );      
              switch (mostrar){
                  case "1":
                      String opcion1= JOptionPane.showInputDialog(null, "seleccione \n \n " +
                              "1. agregar oficinista\n" +
                              "2. agregar area de trabajo\n"
                             ); 
                      agegarNuevoEmpleado(opcion1);
                      break;
                  case "2":
                      String option2 = JOptionPane.showInputDialog(null,"Por favor elige una opcion a realizar \n\n" +
                            "1. mostrar oficinistas\n" +
                            "2. mostrar areas de trabajo\n"
                    );
                    mostrarEmpleados(option2);
                      break;
                      case "3":
                    asignarEmpleado();
                    break;
                      case "4":
                    salir = true;
                    JOptionPane.showMessageDialog(null, "Chao, ojala vuelvas pronto!");
                    break;
              }
          }
    }

 public static void agegarNuevoEmpleado(String opcion1) {
     int codigo;
     int cedula;
     String nombre;
     
     switch (opcion1)
     {
         case "1":
             cedula = Integer.parseInt(JOptionPane.showInputDialog(null,"digite la cedula \n \n "));
                nombre = JOptionPane.showInputDialog(null,"digite el nombre \n \n ");
                oficinistas.add(new Oficinista(cedula,nombre));
                break;
                
                case "2":
                codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"digite el codigo de area \n \n "));
                areaTrabajos.add(new AreaTrabajo(codigo));
                break;
    }
 }

    private static void mostrarEmpleados(String option2) {
        switch (option2){
            case "1":
                if (oficinistas.size() == 0){
                    JOptionPane.showMessageDialog(null, "No hay oficinistas");
                    break;
                }
                for (Oficinista oficinista:  oficinistas) {
                    JOptionPane.showMessageDialog(null, oficinista.toString());
                }
                break;
                case "2":
                if (areaTrabajos.size() == 0){
                    JOptionPane.showMessageDialog(null, "No hay areas de trabajo");
                    break;
                }
                for (AreaTrabajo areaDeTrabajo:  areaTrabajos) {
                    JOptionPane.showMessageDialog(null, areaDeTrabajo.toString());
                }
                break;
        }
    }

    private static void asignarEmpleado() {
        if (areaTrabajos.size() == 0){
            JOptionPane.showMessageDialog(null, "no hay areas de trabajo");
        }
       for (AreaTrabajo areaTrabajo: areaTrabajos) {
            String option1 = JOptionPane.showInputDialog(null,
                    areaTrabajo.toString() +
                            "\n Desea asignar un empleado?\n " +
                            "1. si \n" +
                            "2. no"
                        );
                    if (option1.equals("1")){
                String empleado = JOptionPane.showInputDialog(null,
                        "que tipo de empleado?\n " +
                                "1. oficinista \n" 
                                
                         );
                        switch (empleado){
                        case "1":
                        if (oficinistas.size() == 0){
                            JOptionPane.showMessageDialog(null, "No hay oficinistas");
                            break;
                        }        
            for (Oficinista oficinista : oficinistas) {
                            String asignar = JOptionPane.showInputDialog(null,
                                    oficinista.toString() + "\n" +
                                            "asignar?\n" +
                                            "1. si\n" +
                                            "2. siguiente");
            if (asignar.equals("1")){
                                areaTrabajo.asignarNuevoOficinista(oficinista);
                            }
                        }
            break;
          
    }
                    }
       }
    }
}
        
    

