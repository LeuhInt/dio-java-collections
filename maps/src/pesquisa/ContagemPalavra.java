package pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavra {
    private Map<String, Integer> mapPalavra;
    public ContagemPalavra() {
        this.mapPalavra = new HashMap<>();
    }
    public void adicionaPalavra(String palavra, Integer contagem) {
        mapPalavra.put(palavra, contagem);
    }
    public void removerPalavra(String palavra) {
        mapPalavra.remove(palavra);
    }
    public void exibirContagemPalavras() {
        System.out.println(mapPalavra);
    }
//    public String encontrarPalavraMaisFrequente() {
//        String palavraMais = null;
//        int contagem = Integer.MIN_VALUE;
//        for(Integer p: mapPalavra.values()) {
//            if(mapPalavra.values() >) {
//            }
//
//        }
//    }
}
