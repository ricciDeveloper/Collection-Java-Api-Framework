import java.util.HashMap;
import java.util.Map;

public class Dicionario {
     private Map<String, String> dicionarioMap;
     private String palavra;
     private String definicao;


    //Construtor vazio
    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }
    //Getter
    public Map<String, String> getDicionarioMap() {
        return dicionarioMap;
    }

    public String getDefinicao() {
        return definicao;
    }

    public String getPalavra() {
        return palavra;
    }


    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
    }
        else {
            throw new RuntimeException("DICIONÁRIO VAZIO!");
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    @Override
    public String toString() {
        return "Dicionario {" +
                "palavra ='" + palavra + '\'' +
                ", definicao ='" + definicao + '\'' +
                " }";
    }

    public String pesquisarPorPalavra(String palavra){
        String pesquisaPalavra = null;
        if(!dicionarioMap.isEmpty()){
            pesquisaPalavra = dicionarioMap.get(palavra);
            return pesquisaPalavra;
        }
        else {
            throw new RuntimeException("DICIONÁRIO VAZIO!");
        }
    }
}
