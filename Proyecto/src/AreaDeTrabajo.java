import gerente.Gerente;
import oficinista.Oficinista;
import supervisor.Supervisor;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AreaDeTrabajo {
    private int codigo;
    private String gerente = "no hay gerente";
    private  String supervisor = "no hay supervisor";
    private List<Oficinista> oficinistas = new ArrayList<>();

    public AreaDeTrabajo(int codigo) {
        this.codigo = codigo;
    }

    public void asignarNuevoOficinista(Oficinista newOficinista){
        newOficinista.setCod_area_asignada(this.codigo);
        oficinistas.add(newOficinista);
    }

    public void asignarSupervisor(Supervisor newSupervisor){
        if (this.supervisor.equals("no hay supervisor")){
            newSupervisor.setCod_area_asignada(this.codigo);
            this.supervisor = newSupervisor.getNombre();
        } else {
            JOptionPane.showMessageDialog(null, "esta area ya tiene asignado un supervisor");
        }
    }

    public void asignarGerente(Gerente newGerente){
        if (this.supervisor.equals("no hay gerente")){
            newGerente.setCod_area_asignada(this.codigo);
            this.gerente = newGerente.getNombre();
        } else {
            JOptionPane.showMessageDialog(null, "esta area ya tiene asignado un gerente");
        }

    }

    public String toString(){
        return ("Codigo Area: " + this.codigo + "\n" +
                "Gerente: " + this.gerente + "\n" +
                "Supervisor: " + this.supervisor + "\n" +
                "Oficinistas: " + this.obetenerTodosNombresOficinistas());
    }

    public String obetenerTodosNombresOficinistas(){
        String nombres = "\n";
        for (Oficinista oficinista: oficinistas) {
            nombres += "-" + oficinista.getNombre() + "\n";
        }
        return nombres;
    }
}
