package NewList.Soma;
import java.util.ArrayList;
import java.util.List;

import NewList.Livros.CatalogoLivros;

public class SomaNumeros {

    List<Integer> listaNumInteiros = new ArrayList<>();

    public SomaNumeros(){
        this.listaNumInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumInteiros.add(numero);
    }

    public Integer calcularSoma(){
        int valor = 0;
        if(!listaNumInteiros.isEmpty()){
            for(int n : listaNumInteiros){
                valor += n; 
            }
        }
        return valor;
    }

    public Integer encontrarMaiorNumero(){
        int valor = 0;
        if(!listaNumInteiros.isEmpty()){
            for(int n : listaNumInteiros){
                if(n>valor){
                    valor = n;
                } 
            }
        }
        return valor;
    }

    public Integer encontrarMenorNumero(){
        int valor = Integer.MAX_VALUE;
        if(!listaNumInteiros.isEmpty()){
            for(int n : listaNumInteiros){
                if(n<valor){
                    valor = n;
                }
            }
        }
        return valor;
    }

    public List<Integer> exibirNumeros(){
        List<Integer> todosNumeros = new ArrayList<>();
        if(!listaNumInteiros.isEmpty()){
            for(int n : listaNumInteiros){
                todosNumeros.add(n);
            }
        }
        return todosNumeros;
    }

    public static void main(String[] args) {

    SomaNumeros soma = new SomaNumeros();

    // Adicionando livros ao catálogo
    soma.adicionarNumero(5);
    soma.adicionarNumero(1);
    soma.adicionarNumero(8);
    soma.adicionarNumero(12);
    soma.adicionarNumero(23);
    soma.adicionarNumero(2);
    soma.adicionarNumero(14);
    soma.adicionarNumero(18);

    // Exibindo livros pelo mesmo autor
    System.out.println(soma.encontrarMenorNumero());
    System.out.println(soma.exibirNumeros());
  }


    
}
