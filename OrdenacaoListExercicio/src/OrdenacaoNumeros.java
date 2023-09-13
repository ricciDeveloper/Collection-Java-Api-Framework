import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.management.RuntimeErrorException;

public class OrdenacaoNumeros {
    //atributo
    private List<Integer> numerosList;

    public List<Integer> getNumerosList() {
        return numerosList;
    }
    //Construtor
        //Iniciamos um arraylist vazio no construtor.
    public OrdenacaoNumeros(){
        this.numerosList = new ArrayList<>();
    }
    //Método para adicionar numeros a lista
    public void adicionarNumero(int numero){
        this.numerosList.add(numero);
    }

    //Método para ordenar ascendente
    public List<Integer> ordenarAscendente(){
        //Iniciamos uma nova lista, com todos elementos de numeroList
            //para que possamos ordena-los com o Collections.sorte
        List<Integer> ordemAscendente = new ArrayList<>(numerosList);
        //Este if, é uma verificaÇâo da lista, se esta vazia, caso esteja cairia no else

        if(!numerosList.isEmpty()){
            //Collections.sorte para ordenar
                    //Collections.sort(list)classifica a lista em ordem natural crescente
        Collections.sort(ordemAscendente);
                //retorno do método
        return ordemAscendente;
        }else{
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public List<Integer> ordenarDescendente(){
        List <Integer> ordenarDescendente = new ArrayList<>(numerosList);
        if(!numerosList.isEmpty()){
                //Collections.sort(list, Collections.reverseOrder())classifica a lista em ordem decrescente.
                ordenarDescendente.sort(Collections.reverseOrder());
                return ordenarDescendente;
        }else{
            throw new RuntimeException("Lista vazia.");
        }
        
    }
    //Método para exibir os numeros adicionados na lista, sem uma ordenaÇâo especifica
    public void exibirNumeros(){
        if(!numerosList.isEmpty()){
            System.out.println(this.numerosList);
        }else{
            throw new RuntimeException("Lista vazia");
        }
    }

}
