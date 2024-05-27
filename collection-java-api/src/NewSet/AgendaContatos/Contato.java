package NewSet.AgendaContatos;

public class Contato {
    private String nome;
    private int numTelefone;

    public Contato(String nome, int numTelefone){
        this.nome= nome;
        this.numTelefone = numTelefone;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getNumTelefone(){
        return numTelefone;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contato other = (Contato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    public void setNumTelefone(int numTelefone){
        this.numTelefone = numTelefone;
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", numTelefone=" + numTelefone + "]";
    }


}
