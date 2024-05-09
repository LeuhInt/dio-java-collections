package operacoesbasicas;

public class MainConvidado {
    public static void main(String[] args) {

        ConjuntoConvidados convidado = new ConjuntoConvidados();

        System.out.println("Existem: " + convidado.contarConvidado());

        convidado.adicionarConvidado("Convidado 1", 1234);
        convidado.adicionarConvidado("Convidado 2", 1235);
        convidado.adicionarConvidado("Convidado 3", 1235);
        convidado.adicionarConvidado("Convidado 4", 1236);

        convidado.imprimirConvidados();

        convidado.removerConvidado(1234);

        System.out.println("Existem: " + convidado.contarConvidado());


    }
}
