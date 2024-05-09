package pesquisa;

public class MainTarefa {
    public static void main(String[] args) {

        ConjuntoTarefas tarefa = new ConjuntoTarefas();

        tarefa.imprimeTarefas();
        System.out.println(tarefa.contarTarefas());

        tarefa.adicionaTarefa("Tarefa 1");
        tarefa.adicionaTarefa("Tarefa 2");
        tarefa.adicionaTarefa("Tarefa 3");
        tarefa.adicionaTarefa("Tarefa 4");
        tarefa.adicionaTarefa("Tarefa 5");

        tarefa.imprimeTarefas();
        System.out.println(tarefa.contarTarefas());

        tarefa.removerTarefa("Tarefa 5");

        tarefa.imprimeTarefas();
        System.out.println(tarefa.contarTarefas());

        System.out.println(tarefa.obterTarefasConcluidas());
        System.out.println(tarefa.obterTarefasPendentes());

        tarefa.marcarTarefaConcluida("tarefa 1");
        tarefa.marcarTarefaConcluida("tarefa 2");

        System.out.println(tarefa.obterTarefasConcluidas());
        System.out.println(tarefa.obterTarefasPendentes());

        tarefa.marcarTarefaPendente("tarefa 2");

        System.out.println(tarefa.obterTarefasConcluidas());
        System.out.println(tarefa.obterTarefasPendentes());

        tarefa.limparSet();

        tarefa.imprimeTarefas();

    }
}
