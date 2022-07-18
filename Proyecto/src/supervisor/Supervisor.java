package supervisor;



public class Supervisor {
    private double sueldo_basico = 1_000_000;
    private int cod_area_asignada;
    private int cedula;
    private String nombre;
    private String cargo = "Supervisor";
    private double bono_antiguedad;
    private int años_antiguedad;

    public Supervisor(  int cedula, String nombre, int años_antiguedad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.años_antiguedad = años_antiguedad;
        this.bono_antiguedad = ((0.05 * años_antiguedad) * sueldo_basico);
    }

    public String getCargo() {
        return cargo;
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

    public void setBono_antiguedad(double bono_antiguedad) {
        this.bono_antiguedad = bono_antiguedad;
    }

    public String toString(){
        return ("Area asignada: " + this.cod_area_asignada + "\n" +
                "Nombre: " + this.nombre + "\n" +
                "Cedula: " + this.cedula + "\n" +
                "cargo: " + this.cargo + "\n" +
                "Años de antiguedad: " + this.años_antiguedad + "\n" +
                "Bono antiguedad: " + (int) this.bono_antiguedad + "\n" +
                "Sueldo total: " + (int)(this.bono_antiguedad + this.sueldo_basico) + "\n"
        );
    }

}
