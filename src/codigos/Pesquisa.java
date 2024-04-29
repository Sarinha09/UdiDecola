package codigos;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Pesquisa {
    private String origem;
    private String destino;
    private LocalDate data;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private LocalTime horaPesquisa;
    private LocalDate dataPesquisa;
    private String cidade;


    public Pesquisa(String origem, String destino) {
        setOrigem(origem);
        setDestino(destino);
        setDataPesquisa();
    }


    public Pesquisa(String cidade, LocalDate dataInicio, LocalDate dataFim) {
        setDataInicio(dataInicio);
        setDataFim(dataFim);
        setDataPesquisa();
        setHoraPesquisa();
        setCidade(cidade);
    }



    // ---- setters ----
    public void setOrigem(String origem) {
        if(origem.length() > 0) {
            this.origem = origem;
        }
    }
    public void setDestino(String destino) {
        if(destino.length() > 0) {
            this.destino = destino;
        }
    }
    public void setCidade(String cidade) {
        if(cidade.length() > 0) {
            this.cidade = cidade;
        }
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public void setHoraPesquisa(){
        this.horaPesquisa = LocalTime.now();
    }
    public void setDataPesquisa(){
        this.dataPesquisa = LocalDate.now();
    }

    // ---- getters ----

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }
    public LocalDate getData(){
        return data;
    }

    public LocalTime getHoraPesquisa() {
        return horaPesquisa;
    }
    public LocalDate getDataPesquisa() {
        return dataPesquisa;
    }


    public String getCidade() {
        return this.cidade;
    }
}