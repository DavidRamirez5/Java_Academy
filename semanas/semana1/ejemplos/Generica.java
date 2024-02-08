package semana1.ejemplos;

import java.util.ArrayList;
import java.util.List;

public class Generica {

        String name;
        ArrayList<Integer> nums;
        // pasar de objeto a lista Lis.of(array) JAVA 9
        // o Arrays.asList(array) JAVA 8 si se hace de esta manera la lista ya no puede crecer ni decrecer
        // lista.get(element)

        Generica(String name, ArrayList<Integer> nums){
            this.name = name;
            this.nums = nums;
        }

    @Override
    public String toString() {
        return "Generica{" +
                "name='" + name + '\'' +
                ", nums=" + nums +
                '}';
    }
}
