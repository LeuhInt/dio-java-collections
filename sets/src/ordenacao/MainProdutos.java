package ordenacao;

public class MainProdutos {
    public static void main(String[] args) {

        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto(1L, "Produto 3", 15d, 4);
        produtos.adicionarProduto(2L, "Produto 2", 1d, 3);
        produtos.adicionarProduto(3L, "Produto 4", 5d, 2);
        produtos.adicionarProduto(4L, "Produto 5", 10d, 5);

        System.out.println(produtos.exibirProdutosPorNome());

        System.out.println(produtos.exibirProdutosPorPreco());
    }
}
