package ordenacao;

import java.util.*;

public class OrdencaoPessoa {

    private List<Pessoa> listPessoas;

    public OrdencaoPessoa() {
        this.listPessoas = new ArrayList<Pessoa>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> listPessoaIdade = new ArrayList<>(listPessoas);
        Collections.sort(listPessoaIdade);
        return listPessoaIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> listPessoaAltura = new ArrayList<>(listPessoas);
        Collections.sort(listPessoaAltura, new ComparatorPorAltura());
        return listPessoaAltura;
    }
}
