package ordenacao;

import java.util.Comparator;

public class ComparatePorMedia implements Comparator<Aluno> {
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o1.getMedia(), o2.getMedia());
    }
}
