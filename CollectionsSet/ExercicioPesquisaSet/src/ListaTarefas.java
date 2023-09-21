import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //atributo
    private Set<Tarefa> tarefaSet;
    //Construtor com hashset vazio
    public ListaTarefas(){
        this.tarefaSet = new HashSet<>();
    }
    //metodo para adicionar tarefa
    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }
    //metodo para remover tarefa
    public void removerTarefa(String descricao) {
    Tarefa tarefaRemover = null;
    if (!tarefaSet.isEmpty()) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equals(descricao)) { // Corrigido para usar equals()
                tarefaRemover = t;
                break;
            }
        }
        if (tarefaRemover != null) {
            tarefaSet.remove(tarefaRemover);
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    } else {
        System.out.println("lista de tarefas vazia");
    }
    }


    //metodo para exibir as tarefas
    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }
    //Metodo contador de tarefas
    public void contarTarefas(){
        tarefaSet.size();
    }
    public Tarefa tarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
            for (Tarefa t: tarefaSet){
                if(t.getStatusTarefa()){
                    tarefasConcluidas.add(t);
                }
            }
        return tarefasConcluidas();
    }

    public Tarefa tarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa t: tarefaSet){
            if(!t.getStatusTarefa()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes();
    }
    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t: tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setStatusTarefa(true);
            }
        }

    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaMarcarPendente = null;
        for(Tarefa t: tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaMarcarPendente = t;
                break;
            }   
        }
        if(tarefaMarcarPendente != null){
            if(tarefaMarcarPendente.getStatusTarefa()){
                tarefaMarcarPendente.setStatusTarefa(false);
            }
        }
        else{
            System.out.println("Tarefa não encontrada");
        }
        

    }
    public void limparListaTarefas(){
        if(!tarefaSet.isEmpty()){
        tarefaSet.clear();
        }
        else{
            System.out.println("lista vazia.");
        }
        //tarefaSet.removeAll(tarefaset);
    }
}

    

