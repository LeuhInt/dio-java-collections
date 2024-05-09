package ordenacao;

public class MainNumero {
    public static void main(String[] args) {

        OrdenacaoNumeros num = new OrdenacaoNumeros();

        num.adicionarNumero(34);
        num.adicionarNumero(23);
        num.adicionarNumero(54);
        num.adicionarNumero(100);
        num.adicionarNumero(12);

        System.out.println(num.ordenarAscendente());
        System.out.println(num.ordenarDescendente());
    }
}
