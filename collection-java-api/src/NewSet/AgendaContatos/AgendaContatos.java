package NewSet.AgendaContatos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> listaContato;


    public AgendaContatos(){
        this.listaContato = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        listaContato.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        if(!listaContato.isEmpty()){
            System.out.println(listaContato);
        }
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> resultadoNome = new HashSet<>();
        if(!listaContato.isEmpty()){
            for(Contato c : listaContato){
                if(c.getNome().startsWith(nome)){
                    resultadoNome.add(c);
                }
            }
        }
        return resultadoNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        if(!listaContato.isEmpty()){
            for(Contato c : listaContato){
                if(c.getNome().equalsIgnoreCase(nome)){
                    c.setNumTelefone(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
        }
        return contatoAtualizado;

    }

    public static void main(String[] args) {
        // Criando uma instância da classe AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();
    
        // Exibindo os contatos no conjunto (deve estar vazio)
        agendaContatos.exibirContatos();
    
        // Adicionando contatos à agenda
        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);
    
        // Exibindo os contatos na agenda
        agendaContatos.exibirContatos();
    
        // Pesquisando contatos pelo nome
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));
    
        // Atualizando o número de um contato
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);
    
        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();
      }

}
