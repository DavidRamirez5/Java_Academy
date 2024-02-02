package semana1.tareas.Polimorfismo;

public class RunningBack implements Jugador{

    //protected String jugada(){} Recordar que todos los metodos en las interfaces son public y abstract solo se podria poner metoodos public
    @Override
    public String jugada(){
        return "Correr con el balon";
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}
