package ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class MainEvento {
    public static void main(String[] args) {

        AgendaEvento evento = new AgendaEvento();

        evento.printAgenda();

        evento.adicionarEvento(LocalDate.of(2024, Month.JULY, 15), "Evento 1", "Atracao 1");
        evento.adicionarEvento(LocalDate.of(2024, 5, 10), "Evento 2", "Atracao 2");
        evento.adicionarEvento(LocalDate.of(2000, Month.MARCH, 2), "Evento 3", "Atracao 3");
        evento.adicionarEvento(LocalDate.of(2022, Month.FEBRUARY, 23), "Evento 4", "Atracao 4");

        evento.printAgenda();

        evento.obterproximoEvento();

    }
}
