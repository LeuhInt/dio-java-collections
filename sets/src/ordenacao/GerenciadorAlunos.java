package ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> setAlunos;

    public GerenciadorAlunos() {
        this.setAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        setAlunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoremover = null;
        for (Aluno a : setAlunos) {
            if (a.getMatricula() == matricula) {
                alunoremover = a;
                break;
            }
        }
        setAlunos.remove(alunoremover);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(setAlunos);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorMedia() {
        Set<Aluno> alunosPorMedia = new TreeSet<>(new ComparatePorMedia());
        alunosPorMedia.addAll(setAlunos);
        return alunosPorMedia;
    }

    public void exibirAlunos() {
        System.out.println(setAlunos);
    }
}
