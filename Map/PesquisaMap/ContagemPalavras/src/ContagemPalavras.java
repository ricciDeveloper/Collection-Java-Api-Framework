import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //Atributo
    private Map<String, Integer> contagemPalavrasMap;

    //Getters
    public Map<String, Integer> getContagemPalavrasMap() {
        return contagemPalavrasMap;
    }
    //Construtor
    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavrasMap.put(palavra, contagem);
    }
    
    public void removerPalavra(String palavra){
        if(!contagemPalavrasMap.isEmpty()){
            contagemPalavrasMap.remove(palavra);
        }
        else{
            throw new RuntimeException("Contador vazio.");
        }
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for(int contagem  : contagemPalavrasMap.values()){
            contagemTotal += contagem;
        }

        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisUsada = null;
        Integer maiorContagem = 0;
        for(Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()){
            if(entry.getValue() > maiorContagem){
                maiorContagem = entry.getValue();
                palavraMaisUsada = entry.getKey();
            }
        }
        return palavraMaisUsada;
    }
    
    
}
