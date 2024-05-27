package NewMap.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    
    Map<String, String> listarDicionario;

    public Dicionario(){
        this.listarDicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        listarDicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!listarDicionario.isEmpty()){
            listarDicionario.remove(palavra);
        }
    }

    public void exibirPalavras(){
        if(!listarDicionario.isEmpty()){
            System.out.println(listarDicionario);
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String pesquisarPalavra = null;

        if(!listarDicionario.isEmpty()){
            pesquisarPalavra = listarDicionario.get(palavra);
        }
        return pesquisarPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
    
        // Adicionar palavras (linguagens de programação)
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");
    
        // Exibir todas as palavras
        dicionario.exibirPalavras();
    
        // Pesquisar palavras
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);
    
        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);
    
        // Remover uma palavra
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
      }
}
