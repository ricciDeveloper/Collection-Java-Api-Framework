import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline {
    //atributo
    private Map<String, Livro> livrariaMap;

    //Construtor
    public LivrariaOnline() {
        this.livrariaMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livrariaMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String link){
        livrariaMap.remove(link);
    }


    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrariaMap.entrySet());
        
        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());
        
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
        
        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }
            System.out.println(livrosOrdenadosPorPreco);
      return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
            Livro livro = entry.getValue();
            if (livro.getAutor().equals(autor)) {
              livrosPorAutor.put(entry.getKey(), livro);
            }
        }
          return livrosPorAutor;
    }
    public Livro obterLivroMaisCaro(){
      Livro livroMaisCaro = null;
      double maiorPreco = Double.MIN_VALUE;
      for(Livro l : livrariaMap.values()){
        if(l.getPreco() > maiorPreco){
          livroMaisCaro = l;
          maiorPreco = l.getPreco();
        }
      }
      return livroMaisCaro;
    }          
        public Livro obterLivroMaisBarato(){
      Livro livroMaisBarato = null;
      double menorPreco = Double.MAX_VALUE;
      for(Livro l : livrariaMap.values()){
        if(l.getPreco() < menorPreco){
          livroMaisBarato = l;
          menorPreco = l.getPreco();
        }
      }
      return livroMaisBarato;
    }          

}
