package pesquisa;

public class MainContato {
    public static void main(String[] args) {
        AgendaContatos contato = new AgendaContatos();

        contato.adicionarContato("Leo", 123);
        contato.adicionarContato("Mary", 124);
        contato.adicionarContato("Lua", 122);
        contato.adicionarContato("Felipe", 111);

        contato.imprimirContatos();
        System.out.println(contato.pesquisarPorNome("L"));
        contato.atualizarNumeroContato("Leo", 222);
        contato.imprimirContatos();
    }
}
