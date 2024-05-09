package pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoTarefas {

    private Set<Tarefa> setTarefas;

    public ConjuntoTarefas() {
        this.setTarefas = new HashSet<>();
    }

    public void adicionaTarefa(String descricao) {
        setTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemover = null;
        if (!setTarefas.isEmpty()) {
            for (Tarefa t : setTarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaRemover = t;
                    break;
                }
            }
            setTarefas.remove(tarefaRemover);
        } else {
            System.out.println("O set esta vazio");
        }

        if (tarefaRemover == null) {
            System.out.println("Tarefa não encontrada");
        }
    }

    public void imprimeTarefas() {
        System.out.println(setTarefas);
    }

    public int contarTarefas() {
        return setTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : setTarefas) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : setTarefas) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        Tarefa tarefaConcluida = null;
        for (Tarefa t : setTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
                tarefaConcluida = t;
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente = null;
        for (Tarefa t : setTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(false);
                tarefaPendente = t;
                break;
            }
        }
    }

    public void limparSet() {
        setTarefas.clear();
    }
}
