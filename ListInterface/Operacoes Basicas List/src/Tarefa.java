public class Tarefa {
    //Attribute
    private String descricao;

    //Constructor
    public Tarefa(String descricao){
        this.descricao = descricao;
    }
    //Getter method
    public String getDescricao(){
        return descricao;
    }
    @Override
    public String toString(){
        return descricao;
    }
}
