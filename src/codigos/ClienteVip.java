package codigos;
import java.time.LocalDate;

public class ClienteVip extends Cliente {
    private LocalDate dataVip;

    public ClienteVip(String nome, String cpf, String endereco, LocalDate dataNascimento, String email, String senha) {
        super(cpf, nome, endereco, dataNascimento, email, senha);
        setDataVip();
    }

    //----- setters -----
    public void setDataVip() {
        this.dataVip = LocalDate.now();
    }

    // ---- getters ----

    public LocalDate getDataVip() {
        return dataVip;
    }

    // ---- metodos ----
}