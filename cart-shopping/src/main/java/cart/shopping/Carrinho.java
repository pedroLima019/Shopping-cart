package cart.shopping;

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void addProduto(Produto produto) {
        if (produtos.contains(produto)) {
            System.out.println("Produto já existe no carrinho:  " + produto);
        } else {
            produtos.add(produto);
        }
    }

    public void removeProduto(String nome) {
        produtos.removeIf(p -> p.getNome().equalsIgnoreCase(nome));
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println("Listando produtos: " + produto);
        }
    }

    public void limparCarrinho() {
        produtos.clear();
        System.out.println("Carrinho limpo com sucesso ! ");
    }

    public double totalCompra() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getSubtotal();
        }
        return total;
    }
}
