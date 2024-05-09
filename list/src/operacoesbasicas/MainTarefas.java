package operacoesbasicas;

public class MainTarefas {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.obterNumeroTotalTarefas();

        listaTarefas.adicionaTarefa("Tarefa 1");
        listaTarefas.adicionaTarefa("Tarefa 2");
        listaTarefas.adicionaTarefa("Tarefa 2");

        listaTarefas.obterNumeroTotalTarefas();

        listaTarefas.removerTarefa("tarefa 2");

        listaTarefas.obterNumeroTotalTarefas();

        listaTarefas.obterDescricoesTarefas();
    }
}
