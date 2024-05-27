package NewSet.ListaTarefas;

import java.util.HashSet;
import java.util.Set;


public class ListaTarefas {
    
    Set<Tarefa> listaTarefa;

    public ListaTarefas(){
        this.listaTarefa = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if (!listaTarefa.isEmpty()) {
        for (Tarefa t : listaTarefa) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
            tarefaParaRemover = t;
            break;
            }
        }
        listaTarefa.remove(tarefaParaRemover);
    }

    }

    public void exibirTarefas(){
        if(!listaTarefa.isEmpty()){
            System.out.println(listaTarefa);
        }
    }

    public int contarTarefas(){
        return listaTarefa.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!listaTarefa.isEmpty()){
            for(Tarefa t : listaTarefa){
                if(t.isConcluida()){
                    tarefasConcluidas.add(t);
                }
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!listaTarefa.isEmpty()){
            for(Tarefa t : listaTarefa){
                if(!t.isConcluida()){
                    tarefasPendentes.add(t);
                }
            }
        }
        return tarefasPendentes;
    }


    public void marcarTarefaConcluida(String descricao){
        if(!listaTarefa.isEmpty()){
            for(Tarefa t : listaTarefa){
                if(t.getDescricao().equals(descricao)){
                    t.setConcluida(true);
                }
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        if(!listaTarefa.isEmpty()){
            for(Tarefa t : listaTarefa){
                if(t.getDescricao().equals(descricao)){
                    t.setConcluida(false);
                }
            }
        }
    }

    public void limparListaTarefas(){
        if(!listaTarefa.isEmpty()){            
                listaTarefa.clear();            
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();
    
        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");
    
        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();
    
        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();
    
        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());
    
        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());
    
        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");
    
        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());
    
        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();
    
        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
      }
}
