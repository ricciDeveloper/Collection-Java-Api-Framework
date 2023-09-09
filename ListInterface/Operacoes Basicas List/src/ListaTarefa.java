import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //Attribute
    private List<Tarefa> tarefaList;
    
    //Construtor
        /*Com o construtor vazio, sem parâmetros de reotorno (parentes vazios)
         * Sempre que instanciarmos a tarefaList, virá com um ArrayList construído vazio
         * Definido em new ArrayList<>();
         */

         //Métodos 
    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        //Aqui precisamos criar uma nova lista vazia, para guardar os itens a serem removidos
        //Depois vamos iterar sobre tarefaList
        //Comparar se temos os itens do parametro do método. Se sim, vamos armazenar na lista que foi criada vazia.
        //Depois vamos chamar o removeAll, para remover todos os itens com aquela descricao da tarefaList

        List<Tarefa> tarefasForRemove = new ArrayList<>();
        if (!tarefaList.isEmpty()){
            for (Tarefa t : tarefaList){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasForRemove.add(t);
                }
            }
            tarefaList.removeAll(tarefasForRemove);
        } else {
            System.out.println("List Empty.");
        }
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        if(!tarefaList.isEmpty()){
            System.out.println(tarefaList);
        }else{
            System.out.println("List Empty.");
        }
    }
 public static void main(String[] args) {
    // Criando uma instância da classe ListaTarefa
    ListaTarefa listaTarefa = new ListaTarefa();

    // Adicionando tarefas à lista
    listaTarefa.adicionarTarefa("Comprar leite");
    listaTarefa.adicionarTarefa("Estudar para o exame");
    listaTarefa.adicionarTarefa("Fazer exercícios");

    // Exibindo o número total de tarefas na lista
    System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

    // Exibindo as descrições das tarefas na lista
    listaTarefa.obterDescricoesTarefas();

    // Removendo uma tarefa da lista
    listaTarefa.removerTarefa("Trabalhar");

    // Exibindo o número total de tarefas na lista após a remoção
    System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

    // Exibindo as descrições das tarefas atualizadas na lista
    listaTarefa.obterDescricoesTarefas();

    // Removendo uma tarefa da lista quando a lista está vazia
    listaTarefa.removerTarefa("Estudar para o exame");

    // Exibindo o número total de tarefas na lista após tentar remover de uma lista vazia
    System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
  }
}
