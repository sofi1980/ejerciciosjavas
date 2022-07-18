
import oficinista.Oficinista;

import java.util.ArrayList;
import java.util.List;

public class AreaDeTrabajo {
    int codigo_area;
    List<Oficinista> oficinistas = new ArrayList<>();

    //constructor
    public AreaDeTrabajo(int codigo_area) {
        this.codigo_area = codigo_area;
    }

    //getters & setters
    public int getCodigo_area() {
        return codigo_area;
    }

    public List<Oficinista> getOfinistas() {
        return oficinistas;
    }

    //metodos

    public void asignarEmpleado(Oficinista oficinista){
        oficinista.setCod_area_asignada(this.codigo_area);
        oficinistas.add(oficinista);
    }
}


