//Aqui é feito a alteraÇão, incorporando o "implements Comparable<Pessoa(generics)>"
public class Pessoa implements Comparable<Pessoa>{
    //Atributos
    private String nome;
    private int idade;
    private double altura;
    //Construtor
    public Pessoa (String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    @Override
    //Esse método da interface Comparable, altera diretamente a classe, nesse caso, Classe Pessoa.
    public int compareTo(Pessoa p) {
        //Como vamos utilizar um inteiro, podemos utilizar um Wrapper, neste caso o Integer
        //Wrapper é uma classe empacotadora, fornecida no java.lang em 8 classes.
        return Integer.compare(idade, p.getIdade());
    }
    //Métodos getters
    public String getNome(){
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }
    
}
