import java.util.ArrayList;
import java.util.List;

public class CaixaDeProdutos extends ProdutoComponente {
    private List<ProdutoComponente> componentes = new ArrayList<>();
    private double descontoProgressivo = 5.0;  

    public CaixaDeProdutos(String nome) {
        super(nome);
    }

    @Override
    public void add(ProdutoComponente componente) {
        componentes.add(componente);
        aplicarDesconto(descontoProgressivo);  
        descontoProgressivo += 5.0;  
    }

    @Override
    public void remove(ProdutoComponente componente) {
        componentes.remove(componente);
    }

    @Override
    public ProdutoComponente getChild(int i) {
        return componentes.get(i);
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (ProdutoComponente componente : componentes) {
            total += componente.getPreco();
        }
        return total;
    }

    @Override
    public void aplicarDesconto(double desconto) {
        for (ProdutoComponente componente : componentes) {
            componente.aplicarDesconto(desconto);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Caixa: ").append(nome).append("\n");
        for (ProdutoComponente componente : componentes) {
            sb.append("  ").append(componente.toString()).append("\n");
        }
        return sb.toString();
    }
}
