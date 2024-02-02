package semana1.tareas.Polimorfismo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Jugador> jugadores = new ArrayList<>();

        jugadores.add(new Quarterback());
        jugadores.add(new WideReceiver());
        jugadores.add(new RunningBack());
        jugadores.add(new DefensiveEnd());

        // Aqui el polimorfismo juega un papel fundamental ya que declarmos a todos
        // los juagaodores de tipo Juagador, no importando la pocision que juegen.
        // Si pusieramos un Tipo de dato QB tendriamos que ingersar solo QB.
        for( Jugador jugador : jugadores){
            System.out.println("Soy un " + jugador.toString() + " mi jugada principal es " + jugador.jugada() );
        }
    }
}
