public class Eventos {

    //Atributos
    private String nome;
    private String atracao;

    //Construtor
    public Eventos(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }
    //Getters
    public String getNome(){
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    //toString
    @Override
    public String toString() {
        return   "Eventos [nome = " + nome + ", atracao = " + atracao + "]" ;
    }
    
}
