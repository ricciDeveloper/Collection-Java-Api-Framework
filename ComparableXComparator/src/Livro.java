import java.util.Comparator;

class Livro implements Comparable<Livro> {

    private String titulo;
    private String autor;
    private int ano;

    //Construtor
    public Livro (String ti, String au, int an){
        this.titulo = ti;
        this.autor = au;
        this.ano = an;

    }
    //usado para ordenar os livros por ano
    public int compareTo(Livro l) {
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

    //Classe para comparar Livro por autor
    class CompararAutor implements Comparator <Livro>{
        @Override
        public int compare (Livro l1, Livro l2){
            return l1.getAutor().compareTo(l2.getAutor());
        }
        
    }

    //Classe para comparar Livro por Ano
    class CompararAno implements Comparator<Livro>{
        @Override
        public int compare(Livro l1, Livro l2){
            return Integer.compare(l1.getAno(), l2.getAno());

            
        }
    }

    
    class CompararAnoAutorTitulo implements Comparator <Livro> {
        @Override
        public int compare(Livro l1, Livro l2){
            int ano = Integer.compare(l1.getAno(), l2.getAno());
            if (ano != 0)
                return ano;
            int autor = l1.getAutor().compareTo(l2.getAutor());
            if (autor != 0)
                return autor;
            return l1.getTitulo().compareTo(l2.getTitulo());
        }
    }
}
