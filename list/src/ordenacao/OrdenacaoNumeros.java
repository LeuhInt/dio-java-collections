package ordenacao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> listNumeros;

    public OrdenacaoNumeros() {
        this.listNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.listNumeros.add(numero);
    }

    public List<Integer> getListNumeros() {
        return this.listNumeros;
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ordenadosAscendente = new ArrayList<>(listNumeros);
        Collections.sort(ordenadosAscendente);
        return ordenadosAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> ordenadosDescendente = new ArrayList<>(listNumeros);
        Collections.sort(ordenadosDescendente.reversed());
        return ordenadosDescendente;
    }
}
