package operacoesbasicas;

public class MainPalavra {
    public static void main(String[] args) {

        Dicionario palavra = new Dicionario();

        palavra.printPalavras();

        palavra.adicionaPalavra("vento", "forte");
        palavra.adicionaPalavra("agua", "gelada");
        palavra.adicionaPalavra("terra", "molhada");
        palavra.adicionaPalavra("fogo", "quente");

        palavra.printPalavras();
        palavra.removerPalavra("terra");
        palavra.printPalavras();
        System.out.println(palavra.pesquisarPalavra("vento"));

    }
}
