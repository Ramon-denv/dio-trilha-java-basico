package NewList.Livros;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  List<Livros> listarLivros = new ArrayList<>();

  public CatalogoLivros(){
    this.listarLivros = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao){
    listarLivros.add(new Livros(titulo, autor, anoPublicacao));
  }

  public List<Livros> pesquisarPorAutor(String autor){
    List<Livros> livrosPorAutor = new ArrayList<>();
    if(!listarLivros.isEmpty()){
        for(Livros livro : listarLivros){
            if(livro.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(livro);
            }
        } 

    }
    return livrosPorAutor;
    
  }

  public List<Livros> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
    List<Livros> pesquisaPorAno = new ArrayList<>();

    if(!listarLivros.isEmpty()){
        for(Livros livro : listarLivros){
            if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                pesquisaPorAno.add(livro);
            }
        }
    }
    return pesquisaPorAno;

  }

  public Livros pesquisarPorTitulo(String titulo){
        Livros livrosPorTitulo = null;
        if(!listarLivros.isEmpty()){
            for(Livros livro : listarLivros){
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livrosPorTitulo = livro;
                    break;
                }
            }
        }
        return livrosPorTitulo;
  }

  public static void main(String[] args) {
    // Criando uma instância do catálogo de livros
    CatalogoLivros catalogoLivros = new CatalogoLivros();

    // Adicionando livros ao catálogo
    catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
    catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
    catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
    catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

    // Exibindo livros pelo mesmo autor
    System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

    // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
    System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));

    // Exibindo livros dentro de um intervalo de anos
    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));

    // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));

    // Exibindo livros por título
    System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

    // Exibindo livros por título (caso em que não há livros com o título especificado)
    System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
  }
}
