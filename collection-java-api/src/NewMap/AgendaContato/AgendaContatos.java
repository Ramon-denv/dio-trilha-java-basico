package NewMap.AgendaContato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    Map<String, Integer> listarContatos;

    public AgendaContatos(){
        this.listarContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        listarContatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!listarContatos.isEmpty()){
            listarContatos.remove(nome);
        }
    }

    public void exibirContatos(){
        if(!listarContatos.isEmpty()){
            System.out.println(listarContatos);
        }else{
            System.out.println("Lista esta vazia!");
        }
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroTelefone= null;
        if(!listarContatos.isEmpty()){
            numeroTelefone = listarContatos.get(nome);           
        }
        return numeroTelefone;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
    
        // Adicionar contatos
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);
    
        agendaContatos.exibirContatos();
    
        // Remover um contato
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();
    
        // Pesquisar número por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);
    
        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
      }

}
