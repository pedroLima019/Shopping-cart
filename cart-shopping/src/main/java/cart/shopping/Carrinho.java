package cart.shopping;

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removeProduto(String nome) {
        produtos.removeIf(p -> p.getNome().equalsIgnoreCase(nome));
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public double totalCompra() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getSubtotal();
        }
        return total;
    }
}
