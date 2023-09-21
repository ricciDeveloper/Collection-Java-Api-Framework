import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    //atributo

    private Set<Produto> produtoSet;

    public Set<Produto> getProdutoSet() {
        return produtoSet;
    }

    //Construtor
    public CadastroProduto(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));

    }

    //aqui utilizamos o tree set, pois no Produto, utilizamos o comparable para organizar
        //E o HashSet é aleatório o armazenamento.
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>();
        produtosPorNome.addAll(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }
}
