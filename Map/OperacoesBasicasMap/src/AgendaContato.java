import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    //atributo
    private Map<String, Integer> agendaContatoMap;


    //Construtor, pra instanciar com um HashMap vazio
            //hashMap é a implementação mais comum usada com o Map

    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }

    //Método adicionar contato
        //Em MAP usamos PUT invés de add.
            //Nesse cenário a Key do map é o nome
                    //Value é o telefone
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    
    //Método para remover contato
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
            //como trabalhamos com o Key, é uma chave única, não precisamos iterar todo o hashmap
                //apenas passar como argumento a key a ser deletada.
        }
        else{
            throw new RuntimeException("Agenda vazia!");
        }
    }
    //Método para exibir todos contatos da agenda
    public void exibirContato(){
        System.out.println(agendaContatoMap );
    }

    //Método para pesquisar o telefone pelo nome do contato
            //Passamos como parametro o nome
            //declaramos uma variavel nula, para armazenar o numero de telefone posteriormente
            //Ao verificar que o map contem elementos, usamos o get para atribuir o telefone localizado na variavel
                //retornamos a variavel com o valor pesquisado ja atribuido
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
            return numeroPorNome;
        }
        else{
            throw new RuntimeException("Agenda vazia!");
        }
    }
}
