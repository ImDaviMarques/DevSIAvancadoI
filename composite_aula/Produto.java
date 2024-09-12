public class Produto extends ProdutoComponente {

    public Produto(String nome, double preco) {
        super(nome);
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void aplicarDesconto(double desconto) {
        this.preco -= this.preco * (desconto / 100);
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: " + preco;
    }
}
