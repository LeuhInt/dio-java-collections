package operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> setConvidado;

    public ConjuntoConvidados() {
        this.setConvidado = new HashSet<>();
    }

    public void adicionarConvidado(String name, int codigoConvite) {
        setConvidado.add(new Convidado(name, codigoConvite));
    }

    public void removerConvidado(int codigoConvite) {
        Convidado convidadoRemover = null;
        for (Convidado c : setConvidado) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoRemover = c;
                break;
            }
        }
        setConvidado.remove(convidadoRemover);
    }

    public int contarConvidado() {
        return setConvidado.size();
    }

    public void imprimirConvidados() {
        System.out.println(setConvidado);
    }
}
