package operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionaTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarafasRemover = new ArrayList<>();
        for (Tarefa t : listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarafasRemover.add(t);
            }
        }
        listaTarefas.removeAll(tarafasRemover);
    }

    public void obterNumeroTotalTarefas() {
        System.out.println("Total de Tarefas: " + listaTarefas.size());
    }

    public void obterDescricoesTarefas() {
        System.out.println(listaTarefas);
    }
}
