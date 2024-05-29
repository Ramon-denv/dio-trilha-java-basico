package ApiStream;
import java.util.Arrays;
import java.util.List;

public class Function {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

    List<Integer> numerosDobrados = numeros.stream()
    .map( n -> n*2 )
    .toList();

    numerosDobrados.forEach(System.out::println);
   
}
    
    
    
}
