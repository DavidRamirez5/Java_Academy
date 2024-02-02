package semana1.tareas.Singleton;

// Ejemplo de una clase Singleton
public class Formula1Team {

    private static Formula1Team instancia;
    private String escuderia;
    private String modelo;
    public static int contador; // Pertenece a la clase no al obejto


    private Formula1Team(){
        this.escuderia = "Red Bull";
        this.modelo = "RB19";
        contador++;
    }

    // Metodo que va a retonar la instancia.

    public static Formula1Team getInstancia(){
        if(instancia == null){
            instancia = new Formula1Team();
        }
        return instancia;
    }

    public String getEscuderia(){
        return this.escuderia;
    }
    public String getModelo(){
        return this.modelo;
    }

    public void actualizarModelo(String modelo){
        this.modelo = modelo;
    }


}
