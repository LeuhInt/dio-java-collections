package operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> mapContatos;

    public AgendaContatos() {
        this.mapContatos = new HashMap<>();
    }

    public void adicionaContato(String nome, Integer telefone) {
        mapContatos.put(nome, telefone);
    }

    public void removeContato(String nome) {
        if (!mapContatos.isEmpty()) {
            mapContatos.remove(nome);
        } else {
            System.out.println("Map vazia");
        }
    }

    public void printContatos() {
        System.out.println(mapContatos);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!mapContatos.isEmpty()) {
            numeroPorNome = mapContatos.get(nome);
        }
        return numeroPorNome;
    }
}
