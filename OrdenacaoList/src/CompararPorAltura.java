import java.util.Comparator;

public class CompararPorAltura implements Comparator<Pessoa>{
    //Método para comparar a altura, utilizando o Comparator.
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
        
    }
}
