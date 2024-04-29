package codigos;

import java.io.Serializable;
import java.time.LocalDate;

public class Funcionario extends Pessoa implements Serializable {

    private String numeroCarteira;
    private float salarioFixo;

    public Funcionario(String nome, String cpf, String endereco, LocalDate dataNasc, String numeroCarteira, String senha) {
        super(nome, cpf, endereco, dataNasc, senha);
        setNumeroCarteira(numeroCarteira);
    }

    public Funcionario(String nome, String cpf, String endereco, LocalDate dataNasc, String numeroCarteira, String senha, float salario) {
        super(nome, cpf, endereco, dataNasc, senha);
        setNumeroCarteira(numeroCarteira);
        setSalarioFixo(salario);
    }

    public Funcionario() {
        super();
    }

    // ---- setters ----
    public void setNumeroCarteira(String numeroCarteira) {
        if (numeroCarteira.length() > 0) {
            this.numeroCarteira = numeroCarteira;
        }
    }

    public void setSalarioFixo(float salarioFixo) {
        if (salarioFixo > 0) {
            this.salarioFixo = salarioFixo;
        }
    }

    // ---- getters ----
    public String getNumeroCarteira() {

        return numeroCarteira;
    }

    public float getSalarioFixo() {

        return salarioFixo;
    }
}
