package NewSet.ListaAluno;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private Long matricula;
    private double nota;

    public Aluno(String nome,Long matricula,double nota){
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Long getMatricula(){
        return matricula;
    }
    public void setMatricula(Long matricula){
        this.matricula = matricula;
    }

    public double getNota(){
        return nota;
    }
    public void setNota(double nota){
        this.nota = nota;
    }

    public String toString(){
        return "Nome = " + nome + " Matricula = " + matricula + " Nota = " + nota;
    }

    @Override
    public int compareTo(Aluno a) {
       return nome.compareTo(a.getNome());
    }
}

    class ComparetorPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }


}

 
 
