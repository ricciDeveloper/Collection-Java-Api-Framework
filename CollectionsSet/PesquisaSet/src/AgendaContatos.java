import java.util.HashSet;
import java.util.Set;

import javax.management.RuntimeErrorException;

public class AgendaContatos {
    //Atributo
    private Set<Contato> contatosSet;
    
    //Construtor

    public AgendaContatos(){
        this.contatosSet = new HashSet<>();
    }
    //Método adicionar contato
    public void adicionarContato(String nome, int numero){
        contatosSet.add(new Contato(nome, numero));
    }
    //método para exibir todos os contatos
    public void exibirContatos(){
        if(!contatosSet.isEmpty()){
            System.out.println(contatosSet);
        }
        else{
            System.out.println("Conjunto vazio");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        if(!contatosSet.isEmpty()){
            for(Contato c : contatosSet){
                //Aqui usamos o metodo startsWith, para que possmos incluir todos os nomes que comecem iguais, mas mudam o sobrenome
                    //Invés do utilizar o equals ou equalsIgnore.
                        //Neste cenário startsWith é o melhor.
                if(c.getNome().startsWith(nome)){
                    contatosPorNome.add(c);
                }
            }
        }else{
            throw new RuntimeException("Conjunto vazio!");
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato novoContato = null;
        if(!contatosSet.isEmpty()){
            for(Contato c :  contatosSet){
                if(c.getNome().equalsIgnoreCase(nome)){
                    c.setNumero(novoNumero);
                    novoContato = c;
                    break;
                }
            }
        }
        else{
            throw new RuntimeException("Conjunto vazio.");
        }
        return novoContato;
    }

}
