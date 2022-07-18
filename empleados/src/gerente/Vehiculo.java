package gerente;

public class Vehiculo {
    public int codigo;
    public String marca;
    public int modelo;
    public Gerente gerente_asignado;
    public int estacionamiento;

    public Vehiculo(int codigo, String marca, int modelo, Gerente gerente_asignado, int estacionamiento) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.gerente_asignado = gerente_asignado;
        this.estacionamiento = estacionamiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Gerente getGerente_asignado() {
        return gerente_asignado;
    }

    public void setGerente_asignado(Gerente gerente_asignado) {
        this.gerente_asignado = gerente_asignado;
    }

    public int getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(int estacionamiento) {
        this.estacionamiento = estacionamiento;
    }
}
