package cart.shopping;

public class Main {
    public static void main(String[] args) {
        Produto prod01 = new Produto("Pasta de Dente", 10.00, 5);
        Produto prod02 = new Produto("Arroz ", 15.00, 2);
        Produto prod03 = new Produto("Shampoo", 5.50, 1);
        Carrinho carrinho = new Carrinho();

        carrinho.addProduto(prod01);
        carrinho.addProduto(prod02);
        carrinho.addProduto(prod03);
        carrinho.addProduto(prod03);
        carrinho.listarProdutos();
        carrinho.limparCarrinho();
        System.out.println("Total de compras: " + carrinho.totalCompra());


    }
}
