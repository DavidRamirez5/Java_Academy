package semana1.tareas.Polimorfismo;

import semana1.tareas.programas.Main;

public class WideReceiver implements Jugador{


    @Override
    public String jugada(){
        return "Atrapar el Balon";
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}
