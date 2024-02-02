package semana1.tareas.Singleton;

public class Main {
    public static void main(String[] args) {

        // Apesar de crear dos escuderias solo se crea una intancia
        Formula1Team escuderia1 =Formula1Team.getInstancia();
        Formula1Team escuderia2 = Formula1Team.getInstancia();
        //Formula1Team escuderia3 = new Formula1Team(); No puede ser instanciado

        System.out.println("Escuderia:" + escuderia1.getEscuderia());
        System.out.println("Modelo: " + escuderia2.getModelo());
        System.out.println("Solo se creo " + Formula1Team.contador + " Instancia");
        System.out.println(escuderia1.equals(escuderia2));
    }
}
