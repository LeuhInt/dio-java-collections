package pesquisa;

public class MainPalavras {
    public static void main(String[] args) {
        ContagemPalavra palavra = new ContagemPalavra();

        palavra.exibirContagemPalavras();

        palavra.adicionaPalavra("vento", 2);
        palavra.adicionaPalavra("agua", 4);
        palavra.adicionaPalavra("caneta", 12);
        palavra.adicionaPalavra("papel", 8);

        palavra.exibirContagemPalavras();
        palavra.removerPalavra("agua");
        palavra.exibirContagemPalavras();

    }
}
