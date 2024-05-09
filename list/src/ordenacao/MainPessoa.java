package ordenacao;

public class MainPessoa {
    public static void main(String[] args) {

        OrdencaoPessoa pessoa = new OrdencaoPessoa();

        pessoa.adicionarPessoa("Maria", 12, 1.75);
        pessoa.adicionarPessoa("Jose", 35, 1.80);
        pessoa.adicionarPessoa("Paulo", 23, 1.65);
        pessoa.adicionarPessoa("Josefa", 47, 1.55);

        System.out.println(pessoa.ordenarPorAltura());
        System.out.println(pessoa.ordenarPorIdade());
    }
}
