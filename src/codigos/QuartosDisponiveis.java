package codigos;
import java.util.List;
import java.util.ArrayList;

public class QuartosDisponiveis{
    private List<Integer> qtdQuartos;
    public QuartosDisponiveis() {
        qtdQuartos = new ArrayList<>();
    }

    //---- setters -----
    public void set(int index, int quantidade) {
        if (index >= 0 && index < qtdQuartos.size()) {
            qtdQuartos.set(index, quantidade);
        }
    }

    //----- getters ----
    public int get(int index) {
        if (index >= 0 && index < qtdQuartos.size()) {
            return qtdQuartos.get(index);
        }
        return 0;
    }

    public int getQtdTipo(TipoQuarto tipo) {
        int i = tipo.ordinal();
        if (i >= 0 && i < qtdQuartos.size()) {
            return qtdQuartos.get(i);
        }
        return 0;
    }


    public List<Integer> getQtdQuartos() {
        return qtdQuartos;
    }


    //----- metodos ----
    public void registrarQtd(int single, int duplo, int triplo, int luxo) {
        qtdQuartos.add(single);
        qtdQuartos.add(duplo);
        qtdQuartos.add(triplo);
        qtdQuartos.add(luxo);
    }

}
enum TipoQuarto {
    SINGLE, DUPLO, TRIPLO, LUXO;
}
