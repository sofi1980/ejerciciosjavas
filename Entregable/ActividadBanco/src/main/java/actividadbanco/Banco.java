//psv + tab
package actividadbanco;
//creamos la clase Padre  
abstract  class Persona
{
    protected  String nombre;// proteceted solo que accede cliente o empleado no banco
    protected  String numero;
    
   public void guardarNombre(String nombre){
       // no se va a devolver nada  VOIDDD , no hya calculos
       this.nombre=nombre;//este en el nombre de esta clase de la declada anteriormente
          }
   public void guardarNumero(String numero){
       this.numero=numero;//almacena de  a otra clase
       
   }
}
//clase hija
class Cliente extends Persona{//clase que hereda atributis o metodos de su padre
     protected  int saldo ;// cifras cerrada por eso int
     protected  double porcentajeAnual; // decimales
     protected  double porcentaMensual;
     protected  String tipoCuenta;
     
     public void guardarSaldo(int saldo){
         this.saldo=saldo;// se toma el dato que viene del main y se alamacena
     }
     public  void  guardarPorcentajeAnual(double porcentajeAnual){
         this.porcentajeAnual=porcentajeAnual;
         this.porcentaMensual=this.porcentajeAnual/12;//calculo
     }
     public  void guardartipoCuenta(String tipoCuenta)
     {
         this.tipoCuenta=tipoCuenta;// ultimo es que el que viene del main
         
     }
     public  void retirar(int monto)
     {
         System.out.println("Nombre de cliente = " + this.nombre);
         System.out.println("Numero de cliente = " + this.numero);
         System.out.println("Tipo de cuenta = " + this.tipoCuenta);
         System.out.println("internes anual = " + this.porcentajeAnual);
         System.out.println("Interese mensual = " + this.porcentaMensual);
         System.out.println("saldo = " + saldo);
     if (this.tipoCuenta=="Ahorros")
        {
            if(this.saldo - monto<500){
                System.out.println("retiro no autorizado ");
              }
            else{
                this.saldo=this.saldo - monto;
                System.out.println("nuevo saldo = " + this.saldo);
           }
         }
     else//cuenta de inversion
     {
         if(this.saldo - monto<10000){
                System.out.println("retiro no autorizado < 10000 ");
              }
          else{
                this.saldo=this.saldo - monto;
                System.out.println("nuevo saldo = " + this.saldo);
           }
     }
     }
     
  /* public  void imprimir()
   {
       //soutv+tab
       System.out.println("el saldo es  = " + this.saldo);

   }?*/
             }
   
class Empleado extends Persona{//clase que hereda atributis o metodos de su padre
    protected  int salario;// fijo
    protected  int antiguedad;
    protected  int diasVacaciones;
public  void guardarSalario(int salario){
    this.salario=salario;
    
}
public  void guardarAntiguedad(int antiguedad){
    this.antiguedad=antiguedad;// el primero viene del la clase y el recibe  viene el main
    
}
public  void guardarVacanciones(int diasVacaciones){
    this.diasVacaciones=diasVacaciones;
    
}
public  void datosEmpleado(){
    System.out.println("  "  );
       System.out.println("--- Datos del empleado---" );
    System.out.println(" Nombre " + this.nombre );
    System.out.println(" Numero " + this.numero );
    System.out.println(" salario " + this.salario );
    System.out.println(" antiguedad " + this.antiguedad );
    System.out.println(" vacanciones " + this.diasVacaciones );
}
}


public class Banco { //clase principal
    

    public static void main(String[] args) {//metodo principal
      
        // instanciar Cliente es el nombre de la clase y cliente 1 es el nuevo
        
        Cliente cliente1=new Cliente();
       cliente1.guardarNombre("Adriana Rincon");
       cliente1.guardarNumero("2-001");
        cliente1.guardarSaldo(25000);// llama metodos de la clase padre
        cliente1.guardartipoCuenta("Inversion");//apartir de 1000
         cliente1.guardarPorcentajeAnual(18);//18%
    cliente1.retirar(12000);// si debe dejar ya que deb quedar 10000 cuando es inversion
    // se cambia inversion  el valor incial. y retiro
    //1000 .. Ahorros..  y valor a retirar
   ///////
   
   
   Empleado empleado1 =new Empleado();
   empleado1.guardarNombre("sofia romero");
   empleado1.guardarNumero("1-001");
   empleado1.guardarAntiguedad(10);
   empleado1.guardarSalario(5000);
   empleado1.guardarVacanciones(15);
   empleado1.datosEmpleado();
    }
   }

