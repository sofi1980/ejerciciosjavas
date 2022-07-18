
package areaDeTrabajo;

import java.util.List;
import oficinista.Oficinista;


public class AreaDeTrabajo {
    int codigo_area;
    List<Oficinista> Oficinistas;

    public AreaDeTrabajo(int codigo_area) {
        this.codigo_area = codigo_area;
    }

    public int getCodigo_area() {
        return codigo_area;
    }

    public List<Oficinista> getOficinistas() {
        return Oficinistas;
    }

  
  
    
}
