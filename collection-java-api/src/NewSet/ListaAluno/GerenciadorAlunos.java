package NewSet.ListaAluno;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    
    Set<Aluno> listaAluno;

    public GerenciadorAlunos(){
        this.listaAluno = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        listaAluno.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Set<Aluno> removeAluno = new HashSet<>();
        if(!listaAluno.isEmpty()){
            for(Aluno a : listaAluno){
                if(a.getMatricula() == (matricula)){
                    removeAluno.add(a);
                    break;
                }
            }
        }
        listaAluno.remove(removeAluno);
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> listarPorNome = new TreeSet<>(listaAluno);
        if (!listaAluno.isEmpty()) {
            System.out.println(listarPorNome);
          } else {
            System.out.println("O conjunto está vazio!");
          }
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> listarPorNota = new TreeSet<>(new ComparetorPorNota());
        if (!listaAluno.isEmpty()) {
            listarPorNota.addAll(listaAluno);
            System.out.println(listarPorNota);
          } else {
            System.out.println("O conjunto está vazio!");
          }
    }

    public void exibirAlunos(){
        if(!listaAluno.isEmpty()){
            System.out.println(listaAluno);
        }else{
            System.out.println("Lista vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
    
        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);
    
        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.listaAluno);
    
        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAluno(000L);
        gerenciadorAlunos.removerAluno(123457L);
        System.out.println(gerenciadorAlunos.listaAluno);
    
        // Exibindo alunos ordenados por nome
        gerenciadorAlunos.exibirAlunosPorNome();
    
        // Exibindo alunos ordenados por nota
        gerenciadorAlunos.exibirAlunosPorNota();
      }



}
