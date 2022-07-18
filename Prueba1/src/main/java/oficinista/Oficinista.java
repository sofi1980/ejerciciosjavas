
package oficinista;


public class Oficinista {
    
    int cod_area_asiganda;

    public int getCod_area_asiganda() {
        return cod_area_asiganda;
    }

    public void setCod_area_asiganda(int cod_area_asiganda) {
        this.cod_area_asiganda = cod_area_asiganda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    String nombre;
    int cedula;
    final String cargo="Oficinista";
    final  int sueldo_basico=1_000_000;

    public Oficinista(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    
  // metodos
    
    public String toString(){
        return ("Nombre :" +this.nombre +"\n" +
                "Cedula :"+ this.cedula +"\n");
  
}
}
