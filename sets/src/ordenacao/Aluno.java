package ordenacao;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private long matricula;
    private double media;

    public Aluno(String nome, long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = nota;
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", nota=" + media +
                '}';
    }

    @Override
    public int compareTo(Aluno o) {
        return nome.compareToIgnoreCase(o.getNome());
    }
}
