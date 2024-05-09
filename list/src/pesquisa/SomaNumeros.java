package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionaNumero(int numero) {
        this.listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : listaNumeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaior() {
        int maior = Integer.MIN_VALUE;
        for (Integer numero : listaNumeros) {
            if (numero >= maior) {
                maior = numero;
            }
        }
        return maior;
    }

    public int encontrarMenor() {
        int menor  = Integer.MAX_VALUE;
        for (Integer numero : listaNumeros) {
            if (numero <= menor) {
                menor = numero;
            }
        }
        return menor;
    }
    public void imprimirListaNumeros() {
            System.out.println(listaNumeros);
    }
}
