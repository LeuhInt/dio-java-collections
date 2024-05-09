package pesquisa;

public class MainLivros {
    public static void main(String[] args) {

        CatalogoLivros livro = new CatalogoLivros();
        livro.adicionarLivro("Livro 1", "Autor 1", 2020);
        livro.adicionarLivro("Livro 1", "Autor 2", 2021);
        livro.adicionarLivro("Livro 3", "Autor 2", 2022);
        livro.adicionarLivro("Livro 3", "Autor 3", 2023);
        livro.adicionarLivro("Livro 4", "Autor 4", 1994);


        System.out.println(livro.pesquisarPorAutor("Autor 4"));
        System.out.println(livro.pesquisarPorintervaloAnos(2020, 2022));
        System.out.println(livro.pesquisarPorTitulo("Livro 3"));
    }
}
