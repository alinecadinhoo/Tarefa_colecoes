import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParteUm {
    public static void main(String[] args) {
        List <String> lista = new ArrayList<>();
        lista.add("Ana Luiza");
        lista.add("Ricardo Gomes");
        lista.add("Fernanda Silva");
        lista.add("André Ferreira");

        Collections.sort(lista);
        System.out.println(lista);
    }
}
