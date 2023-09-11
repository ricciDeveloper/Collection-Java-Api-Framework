public class Itens {
    //Atributos de itens, private, para manter a segurança dos dados.
    //Seguindo o encapsulamento de OO.

    private String nome;
    private int quantidade;
    private double preco;

    //Construtores sobrecarregados
    public Itens(String nome, double preco, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;

    }

    //Métodos getters
    public String getNome() {
        return nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString(){
        return nome;
    }
    
}
