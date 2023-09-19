import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //Atributo
    private Set<Convidado> convidadoSet;

    //Construtor    

            //iniciado com um hash set vazio
    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }
    //Méotod para adicionar o convidado no hashset
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));

    }

    public void removerConvidado(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c: convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
    
}
