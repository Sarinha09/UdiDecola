package codigos;
import java.io.Serializable;
public class CompanhiaAerea extends Cadastro implements Serializable{
    public CompanhiaAerea(String cnpj, String nomeOficial, String nomeDivulga) {
        super(cnpj, nomeOficial, nomeDivulga);
    }
    public CompanhiaAerea() {
      super();
    }

    public String toString() {
        return getNomeDivulga();
    }
}
