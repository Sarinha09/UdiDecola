package codigos;
import java.io.Serializable;
import java.time.LocalDate;
public abstract class Cadastro implements Serializable{
    private String cnpj;
    private String nomeOficial;
    private String nomeDivulga;
    private LocalDate dataCriacao;

    public Cadastro(String cnpj, String nomeOficial, String nomeDivulga) {
        setCnpj(cnpj);
        setNomeOficial(nomeOficial);
        setNomeDivulga(nomeDivulga);
        this.dataCriacao = LocalDate.now();
    }
    public Cadastro(){}

    //---- setters -----
    private void setCnpj(String cnpj) {
        if (cnpj.length() > 0) {
            this.cnpj = cnpj;
        }
    }


    private void setNomeOficial(String nomeOficial) {
        if (nomeOficial.length() > 0) {
            this.nomeOficial = nomeOficial;
        }
    }

    private void setNomeDivulga(String nomeDivulga) {
        if (nomeDivulga.length() > 0) {
            this.nomeDivulga = nomeDivulga;
        }
    }

    //----- getters -----

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNomeOficial() {
        return nomeOficial;
    }

    public String getNomeDivulga() {
        return nomeDivulga;
    }

    //----- metodos ------
}



