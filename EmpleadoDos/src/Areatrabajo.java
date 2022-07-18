
import java.util.ArrayList;
import java.util.List;


public class Areatrabajo {
    int codigo;
    List<Oficinista> oficinistas = new ArrayList<>();
    
    
    public Areatrabajo( int codigo){
        this.codigo=codigo;
    }
   
    public void asignarNuevoOficinista(Oficinista newOficinista) {
        
        newOficinista.setCod_area(this.codigo);
        oficinistas.add(newOficinista);
    }
      public String toString()
    {
        return ("Codigo del Area: " + this.codigo + "\n" +
                "Oficinistas:" +this.obtenerTodosNombresOficinistas());
                    }

    private String obtenerTodosNombresOficinistas() {
        String nombres ="\n";
        for (Oficinista oficinista:oficinistas)
        {
            nombres += "*" + oficinista.getNombre()+ "\n";
        }
        return nombres;
    }
}

