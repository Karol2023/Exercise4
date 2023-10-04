import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static List<String> konwertujNaWielkieLitery(List<String> listaCiagow) {
        return listaCiagow.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> listaCiagow = List.of("abc", "def", "ghi");
        List<String> listaWielkichLiter = konwertujNaWielkieLitery(listaCiagow);

        System.out.println("Oryginalna lista: " + listaCiagow);
        System.out.println("Lista po konwersji na wielkie litery: " + listaWielkichLiter);
    }
}