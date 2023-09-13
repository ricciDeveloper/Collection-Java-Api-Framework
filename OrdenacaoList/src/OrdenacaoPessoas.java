import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    //Atributo
    
    private List<Pessoa> pessoaList;
    
    public List<Pessoa> getPessoaList() {
        return pessoaList;
    }
    public OrdenacaoPessoas(){
        this.pessoaList = new ArrayList<>();
    }
    //Método para adicionar pessoa
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    //Método para comparar idade
    public List<Pessoa> ordenarPorIdade(){
        //Aqui iniciamos uma nova list "pessoasPorIdade", mas não iniciará sozinha
            //Ela é instanciada com todos elementos de pessoaList, pois nessa lista em questão, ainda não está ordendada.
                //Iremos ordenar, através dessa nova lista instanciada, junto ao método desenvolvido.
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        //No collections, utilizamos o método sorte "Collections.sorte", para organizar os elementos da lista
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
        
    }

    //Método para ordenar por altura
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        //Como queremos utilizar o comparator, aqui instanciamentos a classe CompararPorAltura, esta que está implementada pelo comparator.
        Collections.sort(pessoasPorAltura,new CompararPorAltura());
        return pessoasPorAltura;
    }
}
