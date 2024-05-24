package OrdenacaoNumero;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    
    List<Integer> listaNumero = new ArrayList<>();

    public OrdenacaoNumeros(){
        this.listaNumero = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumero.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> OrdenarNumeroAsc = new ArrayList<>(listaNumero);
        if(!OrdenarNumeroAsc.isEmpty()){
            Collections.sort(OrdenarNumeroAsc);
            return OrdenarNumeroAsc;
        }else {
            throw new RuntimeException("A lista está vazia!");
          }
        
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> OrdenarNumeroDesc = new ArrayList<>(listaNumero);
        if(!OrdenarNumeroDesc.isEmpty()){
            OrdenarNumeroDesc.sort(Collections.reverseOrder());
            return OrdenarNumeroDesc;
        }else {
            throw new RuntimeException("A lista está vazia!");
          }
    }

    public void exibirNumeros(){
        if(!listaNumero.isEmpty()){
            System.out.println(this.listaNumero);
        }else{
            System.out.println("Alista esta vazia, por favor tentar novamente");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
    
        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
    
        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());
    
        // Exibindo a lista
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());
    
        // Exibindo a lista
        numeros.exibirNumeros();
      }

    
}
