package semana1.tareas.Polimorfismo;

public class DefensiveEnd implements Jugador{

    public  String jugada(){
       return "Capturar al QB";
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
