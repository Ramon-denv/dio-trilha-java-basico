package NewList.Tarefas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefas> tarefalist;

    public ListaTarefas(){
        this.tarefalist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefalist.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefas> tarefasParaRemover = new ArrayList<>();
        for(Tarefas t : tarefalist){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
                System.out.println(t);
            }
        }
        tarefalist.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefalist.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefalist);
    }

}
