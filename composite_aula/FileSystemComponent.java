abstract class FileSystemComponent{

    String nome;
    double tamanho;

    public FileSystemComponent(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void add(FileSystemComponent component){
        System.out.println("Add da Interface");
    }

    public void remove(FileSystemComponent component){
        System.out.println("Remove da Interface");
    }

    public void getChild(FileSystemComponent component){
        System.out.println("Get child da Interface");
    }

    public abstract void mostraEstrutura(String ind);

    public double getTamanho() {
        return tamanho;
    }

}