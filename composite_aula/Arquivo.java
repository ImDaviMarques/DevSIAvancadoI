/*
 * Objeto simples (Folha) 
 */

public class Arquivo extends FileSystemComponent{
    
    double tamanho;

    public Arquivo(String nome, double tamanho){
        super(nome);
        this.tamanho = tamanho;
    }

    @Override
    public void mostraEstrutura(String ind) {
       System.out.println(ind + "Arquivo: "+ getNome());
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}
