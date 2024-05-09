package pesquisa;

public class MainNumeros {
    public static void main(String[] args) {
        SomaNumeros num = new SomaNumeros();

        num.adicionaNumero(1);
        num.adicionaNumero(2);
        num.adicionaNumero(4);
        num.adicionaNumero(3);
        num.adicionaNumero(12);
        num.adicionaNumero(27);

        num.imprimirListaNumeros();

        System.out.println("A soma dos numeros é: " + num.calcularSoma());
        System.out.println("O maior numero é: " + num.encontrarMaior());
        System.out.println("O menor numero é: " + num.encontrarMenor());
    }
}
