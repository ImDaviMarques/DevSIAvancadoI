abstract class ProdutoComponente {
    String nome;
    double preco;

    public ProdutoComponente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void add(ProdutoComponente componente) {
        throw new UnsupportedOperationException("Operação não suportada");
    }

    public void remove(ProdutoComponente componente) {
        throw new UnsupportedOperationException("Operação não suportada");
    }

    public ProdutoComponente getChild(int i) {
        throw new UnsupportedOperationException("Operação não suportada");
    }

    public abstract double getPreco();

    public abstract void aplicarDesconto(double desconto);
}
