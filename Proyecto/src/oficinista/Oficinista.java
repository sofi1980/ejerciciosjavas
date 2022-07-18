package oficinista;


public class Oficinista{
    private int cod_area_asignada;
    private String nombre;
    private int cedula;
    private String cargo = "Oficinista";
    private double sueldo_basico = 1_000_000;

    public Oficinista( int cedula, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
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

    public String getCargo() {
        return cargo;
    }

    public String toString(){
        return ("Area asignada: " + this.cod_area_asignada + "\n" +
                "Nombre: " + this.nombre + "\n" +
                "Cedula: " + this.cedula + "\n" +
                "cargo: " + this.cargo + "\n" +
                "Sueldo total: " + (int)( this.sueldo_basico) + "\n"
        );
    }
}
