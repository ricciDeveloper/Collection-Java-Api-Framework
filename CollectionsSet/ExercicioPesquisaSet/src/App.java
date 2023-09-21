public class App {
    public static void main(String[] args) throws Exception {
        ListaTarefas lt = new ListaTarefas();

        lt.exibirTarefas();
        lt.adicionarTarefa("Lavar louça");
        lt.adicionarTarefa("Estudar");
        lt.adicionarTarefa("Arrumar Quarto");
        lt.adicionarTarefa("Trabalhar");
        lt.adicionarTarefa("Academia");
        lt.adicionarTarefa("Projeto JAVA");


        lt.exibirTarefas();
        lt.removerTarefa("Estudar");
       
        lt.exibirTarefas();

    }
    
}
