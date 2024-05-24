package Livros;
public class Livros {
    
    private String titulo;
  private String autor;
  private int anoPublicacao;
  
  public Livros(String titulo, String autor, int anoPublicacao){
     this.titulo = titulo;
     this.autor = autor;
     this.anoPublicacao = anoPublicacao;
  }

  public String getTitulo(){
    return titulo;
  }
  public void SetTitulo(String titulo){
    this.titulo = titulo;
  }

  @Override
public String toString() {
    return "Livros [titulo=" + titulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao + "]";
}

public String getAutor(){
    return autor;
  }
  public void SetAutor(String autor){
    this.autor = autor;
  }

  public int getAnoPublicacao(){
    return anoPublicacao;
  }
  public void SetAnoPublicacao(int anoPublicacao){
    this.anoPublicacao = anoPublicacao;
  }

 
}
