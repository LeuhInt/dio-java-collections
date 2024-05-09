package operacoesbasicas;

public class MainItens {
    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        carrinhoCompras.imprimirLista();

        carrinhoCompras.adicionarItem("feijao", 2.5, 5);
        carrinhoCompras.adicionarItem("feijao", 2.5, 5);
        carrinhoCompras.adicionarItem("arroz", 3.6, 4);
        carrinhoCompras.adicionarItem("macarrao", 2.85, 2);
        carrinhoCompras.adicionarItem("carne", 4.52, 3);

        carrinhoCompras.imprimirLista();

        carrinhoCompras.removerItem("feijao");

        carrinhoCompras.imprimirLista();

        System.out.println("O valor total é de: " + carrinhoCompras.calcularTotal());
    }
}
