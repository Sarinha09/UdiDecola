package codigos;
import java.time.LocalDate;
public class Cliente extends Pessoa {
    private LocalDate dataCadastro;
    private String email;
    private int totalCompra;
    private LocalDate dataVip;

    public Cliente() {
        super();
    }

    public Cliente(String nome, String cpf) {
        super(nome, cpf);
    }
    
    public Cliente(String nome, String cpf, String endereco, LocalDate dataNascimento, String email, String senha, LocalDate dataCadastro) {
        super(nome, cpf, endereco, dataNascimento, senha);
        setEmail(email);
    }

    public Cliente(String nome, String cpf, String endereco, LocalDate dataNascimento, String email, String senha) {
        super(nome, cpf, endereco, dataNascimento, senha);
        setEmail(email);
        setdataCadastro();
    }


    // ---- setters ----

    public void setEmail(String email){
        if(email.length() > 0){
            this.email = email;
        }
    }

    public void setTotalCompra() {
        if(totalCompra > 0 ){
            this.totalCompra++;
        }
    }
    
    public void setdataCadastro(){
        this.dataCadastro = LocalDate.now();
    }

    // ---- getters ----
    public String getEmail(){
        return email;
    }
    public int getTotalCompra(){
        return totalCompra;
    }


    public LocalDate getDataCadastro(){
        return dataCadastro;
    }

    // ----- metodos -----
    public boolean isVip() {
        if(GerenciadorGeral.getNumeroCompraVip() > this.totalCompra){
            return true;
        }
        return false;
    }


}

