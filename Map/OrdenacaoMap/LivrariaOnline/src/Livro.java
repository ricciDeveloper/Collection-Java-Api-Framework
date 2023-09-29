public class Livro {
    //Atributos
    private String titulo;
    private String autor;
    private Double preco;
    //Construtor
    public Livro(String titulo, String autor, Double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }
    //Getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public Double getPreco() {
        return preco;
    }
    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", preco=" + preco + "]";
    }
    

    
    
}
