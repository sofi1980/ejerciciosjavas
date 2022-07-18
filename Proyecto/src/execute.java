
import gerente.Gerente;
import oficinista.Oficinista;
import supervisor.Supervisor;
import javax.swing.*;
import java.util.*;

public class execute {
    private static List<Supervisor> supervisores = new ArrayList<>();
    private static List<Oficinista> oficinistas = new ArrayList<>();
    private static List<Gerente> gerentes = new ArrayList<>();
    private static List<AreaDeTrabajo> areaDeTrabajos = new ArrayList<>();



    //MAIN METHOD
    public static void main(String[] args) {

        boolean salir = false;

        while(!salir){
            String mostrarOAñadir = null;
            try{
                 mostrarOAñadir = JOptionPane.showInputDialog(null,"Por favor elige una opcion a realizar\n\n" +
                        "1. agregar nuevo\n" +
                        "2. mostrar seccion\n"  +
                        "3. asignar empleado a un area de trabajo\n"  +
                        "4. salir."
                );
                 if (Integer.parseInt(mostrarOAñadir) > 4){
                     throw new Exception();
                 }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Por favor elija una opcion valida");
            }

            switch (mostrarOAñadir){
                case "1":
                    String option1 = null;
                    try{
                        option1 = JOptionPane.showInputDialog(null,"Por favor elige una opcion a realizar\n\n" +
                                "1. agregar oficinista\n" +
                                "2. agregar supervisor\n" +
                                "3. agregar gerente\n" +
                                "4. agregar area de trabajo\n"
                        );
                        if (Integer.parseInt(option1) > 4){
                            throw new Exception();
                        }
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(null, "Por favor elija una opcion valida");
                        break;
                    }
                    añadirNuevoEmpleado(option1);
                    break;

                case "2":
                    String option2 = null;
                    try{
                        option2 = JOptionPane.showInputDialog(null,"Por favor elige una opcion a realizar\n\n" +
                                "1. mostrar oficinistas\n" +
                                "2. mostrar supervisores\n" +
                                "3. mostrar gerentes\n" +
                                "4. mostrar areas de trabajo\n"
                        );
                        if (Integer.parseInt(option2) > 4){
                            throw new Exception();
                        }
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(null, "Por favor elija una opcion valida");
                        break;
                    }

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

    public static void añadirNuevoEmpleado(String option){
        // valores a tomar
        int codigo = 0;
        int cedula;
        String nombre;
        int años_antiguedad;
        double bono_viaticos;

        //elegir que tipo de empleado añadir
        switch (option){
            case "1":
                try{
                    cedula = Integer.parseInt(JOptionPane.showInputDialog(null,"digite la cedula"));
                    nombre = JOptionPane.showInputDialog(null,"digite el nombre");
                    oficinistas.add(new Oficinista(cedula,nombre));
                    break;
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "El valor ingresado no esta permitido");
                    break;
                }
            case "2":
                try{
                    cedula = Integer.parseInt(JOptionPane.showInputDialog(null,"digite la cedula"));
                    nombre = JOptionPane.showInputDialog(null,"digite el nombre");
                    años_antiguedad = Integer.parseInt(JOptionPane.showInputDialog(null,"digite los años de antiguedad"));
                    supervisores.add(new Supervisor(cedula,nombre, años_antiguedad));
                    break;
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "El valor ingresado no esta permitido");
                    break;
                }
            case "3":
                try{
                    cedula = Integer.parseInt(JOptionPane.showInputDialog(null,"digite la cedula"));
                    nombre = JOptionPane.showInputDialog(null,"digite el nombre");
                    años_antiguedad = Integer.parseInt(JOptionPane.showInputDialog(null,"digite los años de antiguedad"));
                    bono_viaticos = Integer.parseInt(JOptionPane.showInputDialog(null,"digite el valor de los viaticos"));
                    gerentes.add(new Gerente(cedula,nombre,años_antiguedad, bono_viaticos));
                    break;
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, "El valor ingresado no esta permitido");
                    break;
                }

            case "4":
                try{
                    codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"digite el codigo de area"));
                    areaDeTrabajos.add(new AreaDeTrabajo(codigo));
                    break;
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "tipo de valor no permitido, solo numeros");
                    break;
                }
        }
    }

    public static void mostrarEmpleados(String option){
        switch (option){
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
                if (supervisores.size() == 0){
                    JOptionPane.showMessageDialog(null,"No hay supervisores");
                    break;
                }
                for (Supervisor supervisor:  supervisores) {
                    JOptionPane.showMessageDialog(null, supervisor.toString());
                }
                break;
            case "3":
                if (gerentes.size() == 0){
                    JOptionPane.showMessageDialog(null, "no hay gerentes");
                    break;
                }
                for (Gerente gerente:  gerentes) {
                    JOptionPane.showMessageDialog(null, gerente.toString());
                }
                break;
            case "4":
                if (areaDeTrabajos.size() == 0){
                    JOptionPane.showMessageDialog(null, "No hay areas de trabajo");
                    break;
                }
                for (AreaDeTrabajo areaDeTrabajo:  areaDeTrabajos) {
                    JOptionPane.showMessageDialog(null, areaDeTrabajo.toString());
                }
                break;

        }
    }
    public static void asignarEmpleado(){
        if (areaDeTrabajos.size() == 0){
            JOptionPane.showMessageDialog(null, "no hay areas de trabajo");
        }

        for (AreaDeTrabajo areaDeTrabajo: areaDeTrabajos) {
            String option = null;
            try{
                option = JOptionPane.showInputDialog(null,
                        areaDeTrabajo.toString() +
                                "\nDesea asignar un empleado?\n " +
                                "1. si \n" +
                                "2. no"
                );
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Por favor elija una opcion valida");
                break;
            }

            if (option.equals("1")){
                String empleado = null;

                try{
                    empleado= JOptionPane.showInputDialog(null,
                            "que tipo de empleado?\n " +
                                    "1. oficinista \n" +
                                    "2. supervisor \n" +
                                    "3. gerente"
                    );

                    if ( Integer.parseInt(empleado) > 3){
                        throw new Exception();
                    }
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "esta accion no esta permitida");
                    break;
                }

                switch (empleado){
                    case "1":
                        if (oficinistas.size() == 0){
                            JOptionPane.showMessageDialog(null, "No hay oficinistas");
                            break;
                        }
                        for (Oficinista oficinista : oficinistas) {
                            String asignar = null;
                            try{
                                asignar = JOptionPane.showInputDialog(null,
                                        oficinista.toString() + "\n" +
                                                "asignar?\n" +
                                                "1. si\n" +
                                                "2. siguiente");
                            }catch (Exception e){
                                JOptionPane.showMessageDialog(null, "esta accion no esta permitida");
                                break;
                            }
                            if (asignar.equals("1")){
                                areaDeTrabajo.asignarNuevoOficinista(oficinista);
                                break;
                            }
                            continue;
                        }
                        break;
                    case "2":
                        if (supervisores.size() == 0) {
                            JOptionPane.showMessageDialog(null, "No hay supervisores");
                            break;
                        }
                        for (Supervisor supervisor : supervisores) {
                            String asignar = null;
                            try{
                                 asignar = JOptionPane.showInputDialog(null,
                                        supervisor.toString() + "\n" +
                                                "asignar?\n" +
                                                "1. si\n" +
                                                "2. siguiente");
                            }catch (Exception e){
                                JOptionPane.showMessageDialog(null, "esta accion no esta permitida");
                                break;
                            }
                            if (asignar.equals("1")){
                                areaDeTrabajo.asignarSupervisor(supervisor);
                                break;
                            }
                            continue;
                        }
                        break;
                    case "3":
                        if (gerentes.size() == 0){
                            JOptionPane.showMessageDialog(null, "no hay gerentes");
                            break;
                        }
                        for (Gerente gerente : gerentes) {
                            String asignar = null;
                            try{
                                 asignar = JOptionPane.showInputDialog(null,
                                        gerente.toString() + "\n" +
                                                "asignar?\n" +
                                                "1. si\n" +
                                                "2. siguiente");
                            }catch (Exception e){
                                JOptionPane.showMessageDialog(null, "esta accion no esta permitida");
                                break;
                            }
                            if (asignar.equals("1")){
                                areaDeTrabajo.asignarGerente(gerente);
                                break;
                            }
                            continue;
                        }
                        break;
                }
            }
        }
    }
}

