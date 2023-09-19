import java.util.HashSet;

public class Contato {
    private String nome;
    private int numero;
    //Construtor do objeto
    public Contato(String nome, int numero){
        this.nome = nome;
        this.numero = numero;

    }
    //Metodos getters
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }
    //Método set para poder alterar o numero futuramente
    public void setNumero(int numero) {
        this.numero = numero;
    }
    //Sobre escrita do metodo equal and hashCode, para gerarmos a comparação do nome
        //com a comparação podemos aplicar os métodos solicitados no exercicio
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contato other = (Contato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }   
    //Sobreescrita do toString para que não mostre ao usuário o endereço de memória, e sim as informações. 
    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", numero=" + numero + "]";
    }

    
}
