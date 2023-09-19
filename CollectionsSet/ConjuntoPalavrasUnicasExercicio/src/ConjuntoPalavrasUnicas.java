import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributo
    private Set<String> conjuntoPalavrasSet;
 //Construtor, gerando um hashSet empty
    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasSet = new HashSet<>();
    }
    //Método para adicionar palavras ao conjunto HashSet
    public void adicionarPalavra(String palavra){
        conjuntoPalavrasSet.add(palavra);
    }
    //Método para remover palavras 
    public void removerPalavra(String palavra){
        if(!conjuntoPalavrasSet.isEmpty()){
            if(conjuntoPalavrasSet.contains(palavra)){
                conjuntoPalavrasSet.remove(palavra);
            }
            else{
                System.out.println("Palavra não localizada para remoção.");
            }
        }
        else{
            System.out.println("Conjunto vazio.");
        }
    }

    //Método para verificar palavras, retornando um boolean
    public boolean verificarPalavra(String palavra){   
        return conjuntoPalavrasSet.contains(palavra);

    }

    //Método para exibir o hashSet de palavras.
    public void exibirPalavrasUnicas(){
        if(!conjuntoPalavrasSet.isEmpty()){
            System.out.println(conjuntoPalavrasSet );
        }
        else{
            System.out.println("Conjunto vazio.");
        }

    }
    
    
}
