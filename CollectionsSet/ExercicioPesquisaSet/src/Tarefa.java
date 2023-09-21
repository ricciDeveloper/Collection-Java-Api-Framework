public class Tarefa{
        private String descricao;
        private boolean statusTarefa;
    
    
        //construtor
        public Tarefa(String descricao) {
            this.descricao = descricao;
            this.statusTarefa = false;
        }
        //Setters
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
        public void setStatusTarefa(boolean statusTarefa) {
            this.statusTarefa = statusTarefa;
        }

        
        //Getters dos atributos
        public String getDescricao() {
            return descricao;
        }
        public boolean getStatusTarefa() {
            return statusTarefa;
        }
        @Override
        public String toString() {
            return "\n"+"Tarefa [Descrição = " + descricao + ", statusTarefa = " + statusTarefa + "]";
        }
    
    
    }