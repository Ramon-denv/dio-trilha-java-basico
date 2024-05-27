package NewMap.ContagemPalvras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String, Integer> listarPalavras;

    public ContagemPalavras(){
        this.listarPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        listarPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if(!listarPalavras.isEmpty()){
            listarPalavras.remove(palavra);
        }
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        if(!listarPalavras.isEmpty()){
            for(int contagem : listarPalavras.values()){
                contagemTotal += contagem;
            }
        }
        return contagemTotal;
    }
    
    public String encontrarPalavraMaisFrequente(){
        String palavraRepetida = null;
        int maiorContagem = 0;
        if(!listarPalavras.isEmpty()){
            for(Map.Entry<String, Integer> entry : listarPalavras.entrySet()){
                if (entry.getValue() > maiorContagem) {
                    maiorContagem = entry.getValue();
                    palavraRepetida = entry.getKey();
                  }
            }
        }
        return palavraRepetida;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();
    
        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);
    
        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");
    
        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
      }
}
