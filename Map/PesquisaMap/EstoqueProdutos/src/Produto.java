
public class Produto {
    //atributos
    private String nome;
    private double preco;
    private int quantidade;
    
    //Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    //sobreescrita do toString para imprimir o conteúdo, não o endereço de memória
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }
    
    
    
}