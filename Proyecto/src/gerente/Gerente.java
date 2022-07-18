package gerente;

import supervisor.Supervisor;

import java.util.List;

public class Gerente  {
     private double sueldo_basico = 1_000_000;
     private int cod_area_asignada;
     private int cedula;
     private String nombre;
     private String cargo = "Gerente";
     private double bono_antiguedad;
     private double bono_viaticos;
     private List<Supervisor> supervisores_asignados;
     private int años_antiguedad;

     public Gerente( int cedula, String nombre, int años_antiguedad, double bono_viaticos){
          this.cedula = cedula;
          this.nombre = nombre;
          this.años_antiguedad = años_antiguedad;
          this.bono_antiguedad = ((0.05 * años_antiguedad) * sueldo_basico);
          this.bono_viaticos = bono_viaticos;

     }



     public double getSueldo_basico() {
          return sueldo_basico;
     }

     public void setSueldo_basico(double sueldo_basico) {
          this.sueldo_basico = sueldo_basico;
     }

     public int getCod_area_asignada() {
          return cod_area_asignada;
     }

     public void setCod_area_asignada(int cod_area_asignada) {
          this.cod_area_asignada = cod_area_asignada;
     }

     public int getCedula() {
          return cedula;
     }

     public void setCedula(int cedula) {
          this.cedula = cedula;
     }

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public double getBono_antiguedad() {
          return bono_antiguedad;
     }

     public void setBono_antiguedad(int bono_antiguedad) {
          this.bono_antiguedad = bono_antiguedad;
     }

     public double getBono_viaticos() {
          return bono_viaticos;
     }

     public void setBono_viaticos(int bono_viaticos) {
          this.bono_viaticos = bono_viaticos;
     }

     public List<Supervisor> getSupervisores_asignados() {
          return supervisores_asignados;
     }

     public void setSupervisores_asignados(List<Supervisor> supervisores_asignados) {
          this.supervisores_asignados = supervisores_asignados;
     }
     public String getCargo() {
          return cargo;
     }

     public String toString(){
          return ("Area asignada: " + this.cod_area_asignada + "\n" +
                  "Nombre: " + this.nombre + "\n" +
                  "Cedula: " + this.cedula + "\n" +
                  "cargo: " + this.cargo + "\n" +
                  "Años de antiguedad: " + this.años_antiguedad + "\n" +
                  "Bono antiguedad: " + (int) this.bono_antiguedad + "\n" +
                  "Bono viaticos: " + (int) this.bono_viaticos + "\n" +
                  "Sueldo total: " + (int)(this.bono_antiguedad + this.sueldo_basico + this.bono_viaticos) + "\n"
                  );
     }
}
