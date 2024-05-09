package pesquisa;

public class MainProduto {
    public static void main(String[] args) {
        EstoqueProduto produto = new EstoqueProduto();

        produto.printProdutos();

        produto.adicionaProduto(2L, "Produto A", 3.5, 2);
        produto.adicionaProduto(1L, "Produto D", 2.5, 4);
        produto.adicionaProduto(4L, "Produto C", 0.5, 5);
        produto.adicionaProduto(3L, "Produto B", 1.5, 1);

        produto.printProdutos();

        System.out.println(produto.calcularValorEstoque());
        System.out.println(produto.obterProdutoMaisCaro());
        System.out.println(produto.obterProdutoMaisBarato());
        System.out.println(produto.obterProdutoMaisQuantidadeValorTotalEstoque());
    }
}
