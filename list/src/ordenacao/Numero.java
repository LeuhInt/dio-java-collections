package ordenacao;

public class Numero implements Comparable<Numero>{

    private int numero;

    @Override
    public int compareTo(Numero o) {
        return Integer.compare(numero, o.numero);
    }

    @Override
    public String toString() {
        return "Numero{" +
                "numero=" + numero +
                '}';
    }
}
