package oficinista;

public class Oficinista {
    int cod_area_asignada = 0;
    String nombre;
    int cedula;
    String cargo = "Oficinista";
    int sueldo_basico = 1_000_000;

    public Oficinista(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public int getCod_area_asignada() {
        return cod_area_asignada;
    }

    public void setCod_area_asignada(int cod_area_asignada) {
        this.cod_area_asignada = cod_area_asignada;
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

    public String toString(){
        return("Nombre: " + this.nombre + "\n" +
                "Cedula: " + this.cedula + "\n" +
                "codigo: " + this.cod_area_asignada);
    }
}
