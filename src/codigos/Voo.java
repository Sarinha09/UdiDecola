package codigos;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

//data
public class Voo implements Serializable {
    private LocalTime horaPartida;
    private LocalTime horaChegada;
    private LocalDate data;
    private int numeroVagas;
    private float valorPassagem;
    private String ID;
    private TrechoVoo trechovoo;

    public Voo(String ID, LocalDate data, LocalTime horaPartida, LocalTime horaChegada, int numeroVagas, float valorPassagem, TrechoVoo trechovoo){
        setHoraPartida(horaPartida);
        setHoraChegada(horaChegada);
        setNumeroVagas(numeroVagas);
        setValorPassagem(valorPassagem);
        setData(data);
        setID(ID);
        setTrechoVoo(trechovoo);

    }
    
    public Voo(){}

    // ---- setters ----
    
    public void setID(String ID){
        if(ID.length() > 0){
            this.ID = ID;
        }
    }
    public void setTrechoVoo(TrechoVoo trechovoo){
        if(trechovoo != null){
            this.trechovoo = trechovoo;
        }
    }
    public void setHoraChegada(LocalTime horaChegada) {
        this.horaChegada = horaChegada;
    }

    public void setHoraPartida(LocalTime horaPartida) {
        this.horaPartida = horaPartida;
    }

    public void setNumeroVagas(int numeroVagas) {
        if(numeroVagas > 0) {
            this.numeroVagas = numeroVagas;
        }

    }
    public void setValorPassagem(float valorPassagem) {
        if(valorPassagem > 0) {
            this.valorPassagem = valorPassagem;
        }
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    //---- getters ----
    
    public String getID(){
        return this.ID;
    }
    public float getValorPassagem(){
        return this.valorPassagem;
    }

    public int getNumeroVagas() {
        return numeroVagas;
    }

    public LocalTime getHoraChegada() {
        return horaChegada;
    }

    public LocalTime getHoraPartida() {
        return horaPartida;
    }

    public LocalDate getData() {
        return data;
    }
    public TrechoVoo getTrechoVoo(){
        return this.trechovoo;
    }


    // ---- metodos ----
    public boolean conferirVagas(){
        if(numeroVagas > 0){
            return true;
        }
        return false;
    }
    public void darBaixaVagas(int qtd){
        if(numeroVagas > 0){
            this.numeroVagas -= qtd;
        }
    }
}
