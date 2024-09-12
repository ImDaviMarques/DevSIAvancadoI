public class Main {
    public static void main(String[] args) {
 
        ProdutoComponente produto1 = new Produto("Produto 1", 100.0);
        ProdutoComponente produto2 = new Produto("Produto 2", 200.0);
        ProdutoComponente produto3 = new Produto("Produto 3", 300.0);


        ProdutoComponente caixa1 = new CaixaDeProdutos("Caixa 1");
        ProdutoComponente caixa2 = new CaixaDeProdutos("Caixa 2");

       
        caixa1.add(produto1);
        caixa1.add(produto2);

       
        caixa2.add(produto3);
        caixa2.add(caixa1);  

     
        System.out.println(caixa2);

     
        System.out.println("Preço total da " + caixa2.getNome() + ": " + caixa2.getPreco());
    }
}
