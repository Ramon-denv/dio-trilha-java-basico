package ApiStream;
import java.util.List;
import java.util.stream.Stream;

public class Suplier {
    

    public static void main(String[] args) {
        
        List<String> listaSaudacoes = Stream.generate(
            () -> "Olá, seja bem-vindo!")
            .limit(3)
            .toList();

        listaSaudacoes.forEach(System.out::println);

    }
}
