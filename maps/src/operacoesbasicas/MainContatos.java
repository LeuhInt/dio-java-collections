package operacoesbasicas;

public class MainContatos {
    public static void main(String[] args) {

        AgendaContatos contatos = new AgendaContatos();

        contatos.adicionaContato("Leo", 1234);
        contatos.adicionaContato("Mary", 2222);
        contatos.adicionaContato("Vini", 1111);
        contatos.adicionaContato("Iury", 3333);

        contatos.printContatos();
        contatos.removeContato("Vini");
        contatos.printContatos();
        System.out.println(contatos.pesquisarPorNome("Leo"));
    }
}
