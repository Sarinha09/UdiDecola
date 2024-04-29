package codigos;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class FuncionarioParceria extends Funcionario implements Serializable{
    private int numeroHoteis;
    private static float porcentagem = GerenciadorGeral.getPorcentagemParceria();
    private static ArrayList<Hotel> listaHoteisCadastrado = new ArrayList<>();
    public FuncionarioParceria(String nome, String cpf, String endereco, LocalDate dataNasc, String numeroCarteira, float porcentagem, String senha) {
        super(nome, cpf, endereco, dataNasc, numeroCarteira, senha);
        setPorcentagem(porcentagem);
    }
    public FuncionarioParceria(){}

    // ---- setters ----
    public void setNumeroHoteis() {
        this.numeroHoteis++;
    }

    public void setPorcentagem(float porcentagem) {
        if(porcentagem > 0) {
            this.porcentagem = porcentagem;
        }
    }

    public void setSalarioFixo(){
        float aumento = getSalarioFixo() * (this.porcentagem / 100);
        float novoSalario = getSalarioFixo() + aumento;
        super.setSalarioFixo(novoSalario);
    }
    
    public void addHotelCadastrado(Hotel hotel){
        listaHoteisCadastrado.add(hotel);
    }

    // ---- getters ----
    public int getNumeroHoteis(){
        return numeroHoteis;
    }
    public ArrayList<Hotel> getListaHotel(){
        return listaHoteisCadastrado;
    }

}
