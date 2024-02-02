package semana1.ejemplos.singleton;

public class Main {

    public static void main(String[] args) {
        // Se estan creando 3 conexiones.
       // Conexion con1 = new Conexion("MySQL");
        //Conexion con2 = new Conexion("MySQL");
       // Conexion con3 = new Conexion("MySQL");
// Ya no es valido ya que el constuructor es privado

        Conexion con1 =Conexion.getInstance();
        Conexion con2 = Conexion.getInstance();
        Conexion con3 = Conexion.getInstance();

      // No crear varioas soluciones solo un obejto en memoria.

        System.out.println(Conexion.cont);
    }
}
