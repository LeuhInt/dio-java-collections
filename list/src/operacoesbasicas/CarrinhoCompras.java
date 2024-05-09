package operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> listItens;

    public CarrinhoCompras() {
        this.listItens = new ArrayList<Item>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        // Item item = new Item(nome, preco, quantidade);
        // listItem.add(item);
        listItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemsRemover = new ArrayList<>();
        for (Item i : listItens) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemsRemover.add(i);
            }
        } listItens.removeAll(itemsRemover);
    }

    public double calcularTotal() {
        double total = 0d;
        if (!listItens.isEmpty()) {
            for (Item i : listItens) {
                double preco = i.getPreco() * i.getQuantidade();
                total += preco;
            }
            return total;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void imprimirLista() {
        if (!listItens.isEmpty()) {
            System.out.println(listItens);
        } else {
            System.out.println("Lista vazia");
        }
    }
}
