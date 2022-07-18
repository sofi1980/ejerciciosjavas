
package Pilarespoo_1;


public class Main {
    public static void main(String[] args) {
        Planta planta1= new Planta();
        planta1.alimentarse();
        
        AnimalCarnivoro ac1= new AnimalCarnivoro();
        ac1.alimentarse();
        
           AnimalHerbivoro ah1= new AnimalHerbivoro();
        ah1.alimentarse();
    }
    
}
