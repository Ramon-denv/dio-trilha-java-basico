package NewList.Compras;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> listaItens = new ArrayList();
    
    public CarrinhoDeCompras(){
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> removerItem = new ArrayList<>();

        for(Item i : listaItens){
            if(i.getNome().equalsIgnoreCase(nome)){
                removerItem.add(i);
            }
        }
        listaItens.removeAll(removerItem);
    }

    public Double calcularValorTotal(){
        double valorTotal = 0;
        for(Item i : listaItens){
           double valorItem = i.getPreco()*i.getQuantidade();
           valorTotal += valorItem;
        }

        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
    
        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);
    
        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();
    
        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Borracha");
    
        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();
    
        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
      }



}
