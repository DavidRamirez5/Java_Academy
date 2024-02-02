package semana1.ejemplos.singleton;

public class Conexion {

    private  static Conexion conexion; //Declarar un tipo de dato de la misma clase
    private String nombre;
    static  int cont;

   private Conexion(String nombre){ // colocamos el construcutor privado- solo la clase lo puedo invocar
        this.nombre = nombre;
        cont ++;
    }

    public static Conexion getInstance(){
       if(conexion == null) { // si la variable de referenica no apunta a ningun obeto
           conexion = new Conexion("MySql");
           return conexion;
       }
       return conexion;
    }

}
