package cart.shopping;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty()) {
            System.out.println("Nome não pode estar vazio");
        } else {
            this.nome = nome;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("O preço tem que ser maior que zero ! ");
        } else {
            this.preco = preco;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade tem ser maior que zero ! ");
        } else {
            this.quantidade = quantidade;
        }
    }

    public double getSubtotal() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return "Produto: nome: '" + nome + "', preço: " + preco + ", quantidade: " + quantidade + "}";
    }

}
