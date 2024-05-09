package pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> mapProdutos;

    public EstoqueProduto() {
        this.mapProdutos = new HashMap<>();
    }
    public void adicionaProduto(long cod, String nome, double preco, int quantidade) {
        mapProdutos.put(cod, new Produto(nome, preco, quantidade));
    }
    public void printProdutos() {
        System.out.println(mapProdutos);
    }
    public double calcularValorEstoque() {
        double total = 0;
        if (!mapProdutos.isEmpty()) {
            for (Produto p : mapProdutos.values()) {
                total += p.getPreco() * p.getQuantidade();
            }
        } else {
            System.out.println("Estoque vazio");
        }
        return total;
    }
    public Produto obterProdutoMaisCaro() {
        Produto produtoCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto p : mapProdutos.values()) {
            if (p.getPreco() > maiorPreco) {
                produtoCaro = p;
                maiorPreco = p.getPreco();
            }
        }
        return produtoCaro;
    }
    public Produto obterProdutoMaisBarato(){
        Produto produtoBarato = null;
        double menorpreco = Double.MAX_VALUE;
        for (Produto p : mapProdutos.values()) {
            if (p.getPreco() < menorpreco) {
                produtoBarato = p;
                menorpreco = p.getPreco();
            }
        }
        return produtoBarato;
    }
    public Produto obterProdutoMaisQuantidadeValorTotalEstoque() {
        Produto produtoMaior = null;
        double maiorQuantidadeValor = 0d;
        for (Produto p : mapProdutos.values()) {
            double valorProdutoestoque = p.getPreco() * p.getQuantidade();
            if (valorProdutoestoque > maiorQuantidadeValor) {
                produtoMaior = p;
                maiorQuantidadeValor = valorProdutoestoque;
            }
        }
        return produtoMaior;
    }
}
