import java.util.ArrayList;
import java.util.List;

public class Pasta extends FileSystemComponent{
    
    private List<FileSystemComponent> components = new ArrayList<>();

    public Pasta(String nome){
        super(nome);
    }

    public void add(FileSystemComponent component){
        components.add(component);
    }

    public void remove(FileSystemComponent component){
        component.remove(component);
    }

    public FileSystemComponent getChild(int i){
        return components.get(i);
    }

    @Override
    public void mostraEstrutura(String ind) {
       System.out.println(ind + "Pasta: " + getNome());
       for (FileSystemComponent component : components){
            component.mostraEstrutura(ind + "   "); 
       }
    }

    public double getTamanho(){
        double tam = 0;
        for (FileSystemComponent component : components){
            tam += component.getTamanho();
        }

        return tam;
    }

}
