import java.util.ArrayList;
import java.util.List;

public class Examen {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Leonardo");
        nombres.add("Patricia");
        nombres.add("Diego");
        nombres.add("Elizabeth");
        nombres.add("Maria");
        nombres.add("Rosa");
        nombres.add("Luis");
        nombres.add("Mariel");
        nombres.add("Enrique");

        for(String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
