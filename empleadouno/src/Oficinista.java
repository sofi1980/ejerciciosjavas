public class Oficinista {
    int cod_area;
    String nombre;
    int cedula;
    final String cargo="oficinista";
    final double sueldo_basico= 100000;

  public Oficinista(int cedula,String nombre)
            {
            this.cedula=cedula;
            this.nombre=nombre;
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
        public String getCargo() {
        return cargo;
    }
        
    public double getSueldo_basico() {
        return sueldo_basico;
    }

    public int getCod_area() {
        return cod_area;
    }

    public void setCod_area(int cod_area) {
        this.cod_area = cod_area;
    }
    
        public String toString(){
            return  ("Area asiganada"+ this.cod_area + "\n" +
                      "Nombre: " + this.nombre + "\n" +
                       "Cedula: " + this.cedula + "\n" +
                       "cargo: " + this.cargo + "\n" +
                       "sueldo: " +(int)(this.sueldo_basico) + "\n"
                    );
        }    
    
}
