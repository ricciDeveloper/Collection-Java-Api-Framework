import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    //Atributo
    private Map<LocalDate, Eventos> eventosMap;
    //Construtor com hashMap vazio
    public AgendaEventos (){
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Eventos evento = new Eventos(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Eventos proximoEvento = null;
        for (Map.Entry<LocalDate, Eventos> entry : eventosMap.entrySet()) {
          LocalDate dataEvento = entry.getKey();
          if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
            proximaData = dataEvento;
            proximoEvento = entry.getValue();
            break;
          }
        }
        if (proximoEvento != null) {
          System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
        } else {
          System.out.println("Não há eventos futuros na agenda.");
        }
      }
}   
