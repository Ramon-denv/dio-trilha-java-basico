package NewMap.EstoqueProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    
    private Map<Long, Produto> listaProduto;

    public EstoqueProdutos(){
        this.listaProduto = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        listaProduto.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        if(!listaProduto.isEmpty()){
            System.out.println(listaProduto);
        }
    }

    public Double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!listaProduto.isEmpty()){
            for(Produto p : listaProduto.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;

    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double valor = Double.MIN_VALUE;
        if(!listaProduto.isEmpty()){
            for(Produto p : listaProduto.values()){
                if(valor < p.getPreco()){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double valor = Double.MAX_VALUE;
        if(!listaProduto.isEmpty()){
            for(Produto p : listaProduto.values()){
                if(valor > p.getPreco()){
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoQuantidade = null;
        double valorTotalEstoque = 0d;
        if(!listaProduto.isEmpty()){
            for(Map.Entry<Long, Produto> entry : listaProduto.entrySet()){
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > valorTotalEstoque) {
                    valorTotalEstoque = valorProdutoEmEstoque;
                    produtoQuantidade = entry.getValue();
                  }
            }
        }
        return produtoQuantidade;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
    
        // Exibe o estoque vazio
        estoque.exibirProdutos();
    
        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);
    
        // Exibe os produtos no estoque
        estoque.exibirProdutos();
    
        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
    
        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);
    
        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);
    
        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
      }
}
