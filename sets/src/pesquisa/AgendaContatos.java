package pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> setContatos;

    public AgendaContatos() {
        this.setContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone) {
        setContatos.add(new Contato(nome, telefone));
    }

    public void imprimirContatos() {
        System.out.println(setContatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : setContatos) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoTelefone) {
        Contato contatoAtualizado = null;
        for (Contato c : setContatos) {
            if (c.getNome().equals(nome)) {
                c.setTelefone(novoTelefone);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}
