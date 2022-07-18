
import java.util.ArrayList;
import java.util.List;

public class AreaTrabajo {
    int  codigo;
    List<Oficinista> oficinistas= new ArrayList<>();

    
    public AreaTrabajo(int codigo){
        this.codigo= codigo;
    }
    public void asignarNuevoOficinista(Oficinista newOficinista)
    {
        newOficinista.setCod_area(this.codigo);
                oficinistas.add(newOficinista);
    }
    public String toString(){
        return ("Codigo Area: " + this.codigo + "\n" +
                "Oficinistas: " + this.obtenerTodosNombresOficinistas());
    }
    // sale desde la raya
    public String obtenerTodosNombresOficinistas(){
        String nombres = "\n";
        for (Oficinista oficinista: oficinistas) {
            nombres += "-" + oficinista.getNombre() + "\n";
        }
        return nombres;
    }
}