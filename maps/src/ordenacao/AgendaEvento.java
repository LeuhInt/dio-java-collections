package ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEvento {
    private Map<LocalDate, Evento> mapEventos;

    public AgendaEvento() {
        this.mapEventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        mapEventos.put(data, new Evento(nome, atracao));
    }

    public void printAgenda() {
        Map<LocalDate, Evento> eventosPorData = new TreeMap<>(mapEventos);
        System.out.println(eventosPorData);
    }

    public void obterproximoEvento() {
//        Set<LocalDate> dataSet = mapEventos.keySet();
//        Collection<Evento> values = mapEventos.values();
//        mapEventos.get();
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosPorData = new TreeMap<>(mapEventos);
        for (Map.Entry<LocalDate, Evento> entry : eventosPorData.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: "+ proximoEvento + " acontecera na data: " + proximaData);
                break;
            }
        }

    }

}
