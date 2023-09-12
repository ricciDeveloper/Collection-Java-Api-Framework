
class Livroo implements Comparable<Livroo> {

    private String titulo;
    private String autor;
    private int ano;

    //Construtor
    public Livroo (String ti, String au, int an){
        this.titulo = ti;
        this.autor = au;
        this.ano = an;

    }
    //usado para ordenar os livros por ano
    public int compareTo(Livroo l) {
		return titulo.compareTo(l.titulo);
	}

    //Métodos getter para acessar os dados privados
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAno(){
        return ano;
    }


}  
