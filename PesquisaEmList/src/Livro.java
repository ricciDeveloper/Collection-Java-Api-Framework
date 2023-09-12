public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    //Construtor
    public Livro (String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    //Metodos getters para os atributos
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    //Método toString reescrito, para caso precise imprimir a lista.
    //Não irá imprimir o endereço de memória, e sim os objetos da list

    @Override
    public String toString(){
        return "Livro{" +
        "titulo='" + titulo + '\'' +
        ", autor='" + autor + '\'' +
        ", anoPublicacao=" + anoPublicacao +
        '}';
  
    }
}
