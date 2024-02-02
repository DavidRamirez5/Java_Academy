package semana1.tareas.Polimorfismo;

public class Quarterback implements Jugador {
    // Implementamos Contrato
    @Override
    public String jugada(){
        return "Lanzar el Balon";
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
