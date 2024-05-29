package ApiStream;
import java.util.Arrays;
import java.util.List;

public class Predicate {

    public static void main(String[] args) {
        
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        palavras.stream()
        .filter(p -> p.length() > 5)
        .forEach(System.out::println);

    }
    
}
