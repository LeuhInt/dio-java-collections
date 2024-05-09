package ordenacao;

public class MainAlunos {
    public static void main(String[] args) {
        GerenciadorAlunos aluno = new GerenciadorAlunos();

        aluno.exibirAlunos();

        aluno.adicionarAluno("Leo", 1L, 9.5);
        aluno.adicionarAluno("Mary", 5L, 7.5);
        aluno.adicionarAluno("Vini", 2L, 3.5);
        aluno.adicionarAluno("Iury", 4L, 8.5);
        aluno.adicionarAluno("Carlos", 3L, 2.5);

        aluno.exibirAlunos();
        aluno.removerAluno(3L);
        aluno.exibirAlunos();
        System.out.println(aluno.exibirAlunosPorNome());
        System.out.println(aluno.exibirAlunosPorMedia());



    }
}
