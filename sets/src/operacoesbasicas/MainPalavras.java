package operacoesbasicas;

public class MainPalavras {
    public static void main(String[] args) {

        ConjuntoPalavrasUnicas palavra = new ConjuntoPalavrasUnicas();

        palavra.adicionarPalavra("caneta");
        palavra.adicionarPalavra("folha");
        palavra.adicionarPalavra("folha");
        palavra.adicionarPalavra("lapis");
        palavra.adicionarPalavra("borracha");
        palavra.adicionarPalavra("mouse");

        palavra.imprimirPalavras();
        palavra.removerPalavra("mouse");
        palavra.imprimirPalavras();
        System.out.println(palavra.verificarPalavras("folha"));

    }
}
