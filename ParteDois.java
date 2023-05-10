import java.util.ArrayList;
import java.util.List;

public class ParteDois {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Luiz - M");
        nomes.add("Felipe - M");
        nomes.add("Andressa - F");
        nomes.add("Marina - F");
        nomes.add("André - M");
        nomes.add("Fernando - M");
        nomes.add("Maria - F");
        nomes.add("Catarina - F");
        nomes.add("João - M");
        nomes.add("Marcos - M");

        List<String> nomesFemininos = new ArrayList<>();
        List<String> nomesMasculinos = new ArrayList<>();

        for(String nome : nomes) {
            if(nome.contains("- M")) {
                nomesMasculinos.add(nome);
            } else {
                nomesFemininos.add(nome);
            }
        }

        System.out.println("Lista Masculina: " + nomesMasculinos);
        System.out.println("Lista Feminina: " + nomesFemininos);




    }
}
