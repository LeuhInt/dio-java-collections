package operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> setPalavras;

    public ConjuntoPalavrasUnicas() {
        this.setPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        this.setPalavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (setPalavras.contains(palavra)) {
            setPalavras.remove(palavra);
        } else {
            System.out.println("Palavra não encontrada");
        }
    }

    public boolean verificarPalavras(String palavra) {
        return setPalavras.contains(palavra);
    }

    public void imprimirPalavras() {
        System.out.println(setPalavras);
    }
}
