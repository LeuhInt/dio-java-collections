package operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> mapPalavras;

    public Dicionario() {
        this.mapPalavras = new HashMap<>();
    }

    public void adicionaPalavra(String palavra, String descricao) {
        mapPalavras.put(palavra, descricao);
    }

    public void removerPalavra(String palavra) {
        mapPalavras.remove(palavra);
    }

    public void printPalavras() {
        System.out.println(mapPalavras);
    }

    public String pesquisarPalavra(String palavra) {
        String descricaoPalavra = null;
        if (!mapPalavras.isEmpty()) {
            descricaoPalavra = mapPalavras.get(palavra);
        }
        return descricaoPalavra;
    }

}
