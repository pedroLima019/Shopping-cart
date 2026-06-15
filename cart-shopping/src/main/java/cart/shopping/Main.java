package cart.shopping;

public class Main {
    public static void main(String[] args) {
         Produto prod01 = new Produto("Pasta de Dente" , 10.00 , 5);
         Produto prod02 = new Produto("Arroz " , 15.00 , 2 );
         Carrinho carrinho = new Carrinho();

         carrinho.addProduto(prod01);
         carrinho.addProduto(prod02);
         carrinho.listarProdutos();
         carrinho.removeProduto("Pasta de Dente");
        System.out.println("Total de compras: " +  carrinho.totalCompra());
    }
}
