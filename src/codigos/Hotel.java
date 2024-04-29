package codigos;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hotel extends Cadastro implements Serializable {

    private String endereco;
    private int avaliacao;
    private int totalAvaliacoes; //qtd estrelas
    private int somaAvaliacoes; //qtdEstrelas
    private Boolean aceitaPets;
    private int numQuartos;
    private String msgDivulga;
    private String descricao;
    private String cidade;
    private LocalDate checkin;
    private LocalDate checkout;
    private static List<QuartosPorData> quartos;

    //Requisito extra
    //serve  para dizer ao usuario serviços fornecidos pelo hotel
    private Servicos servicos;

    private FuncionarioParceria funcionarioParceria;
    public Hotel(String cnpj, String nomeOficial, String nomeDivulga, String endereco, Boolean aceitaPets, int numQuartos, String msgDivulga, String descricao, String cidade, FuncionarioParceria funcionaParceiro) {
        super(cnpj, nomeOficial, nomeDivulga);
        setEndereco(endereco);
        setNumEstrelas(0);
        setAceitaPets(aceitaPets);
        setNumQuartos(numQuartos);
        setMsgDivulga(msgDivulga);
        setDescricao(descricao);
        setCidade(cidade);
        setFuncionarioParceria(funcionaParceiro);
        quartos= new ArrayList<>();
    }
    
    public Hotel(){}


    // ---- setters ----
    public void setEndereco(String endereco) {
        if (endereco.length() > 0){
            this.endereco = endereco;
        }
    }
    public void setNumEstrelas(int avaliacao) {
        if(avaliacao >= 1 && avaliacao <= 5){
            totalAvaliacoes++;
            somaAvaliacoes += avaliacao;
            this.avaliacao =  calcularMedia();
        }
    }
    public void setAceitaPets(Boolean aceitaPets) {
        if (aceitaPets != null) {
            this.aceitaPets = aceitaPets;
        } else {
            this.aceitaPets = false;
        }
    }
    public void setNumQuartos(int numQuartos) {
        if(numQuartos > 0) {
            this.numQuartos = numQuartos;
        }
    }
    public void setMsgDivulga(String msgDivulga) {
        if(msgDivulga.length() > 0) {
            this.msgDivulga = msgDivulga;
        }
    }
    public void setDescricao(String descricao) {
        if(descricao.length() > 0) {
            this.descricao = descricao;
        }
    }
    public void setCidade(String cidade) {
        if(cidade.length() > 0) {
            this.cidade = cidade;
        }
    }
    
	public void setServicos(Servicos servicos) {
		if(servicos != null) {
            this.servicos = servicos;
        }
	}

    private void setFuncionarioParceria(FuncionarioParceria funcionarioParceiro) {
        if(funcionarioParceiro != null) {
            this.funcionarioParceria = funcionarioParceiro;
        }
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }
    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    // ---- getters ----
    public String getEndereco() {
        return endereco;
    }
    public int getNumEstrelas() {
        return avaliacao;
    }
    public Boolean getAceitaPets() {
        return aceitaPets;
    }
    public int getNumQuartos() {
        return numQuartos;
    }
    public String getMsgDivulga() {
        return msgDivulga;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getCidade() {
        return cidade;
    }

    public LocalDate getCheckin() {
        return checkin;
    }
    public LocalDate getCheckout() {
        return checkout;
    }

    public Servicos getServicos() {
		return servicos;
	}

    // ---- metodos ----
    public int calcularMedia(){
        if(totalAvaliacoes == 0){
            return 0;
        }
        return Math.round((float) somaAvaliacoes/totalAvaliacoes);
    }

    /*
    Registra a disponibilidade de quartos para uma determinada data. Ele recebe como parametros a data para
    registrar os quartos disponiveis, e o objeto QuartosDisponiveis que é uma lista que tem as
     informações dos quartos disponiveis para aquela data
    */
    public void registrarQuartosPorData(LocalDate data, QuartosDisponiveis quartosDisponiveis) {
        for (QuartosPorData quartos : quartos) {
            if (quartos.getData().equals(data)) {
                quartos.setQuartosDisponiveis(quartosDisponiveis);
                return;
            }
        }
        quartos.add(new QuartosPorData(data, quartosDisponiveis, true));
    }


    public QuartosDisponiveis getQuartosDisponiveis(LocalDate dataInicio, LocalDate dataFim) {
        for (QuartosPorData quartos : quartos) {
            LocalDate data = quartos.getData();
            if (!data.isBefore(dataInicio) && !data.isAfter(dataFim)) {
                return quartos.getQuartosDisponiveis();
            }
        }
        return null;
    }
    public boolean verificarDisponibilidade(LocalDate checkin, LocalDate checkout) {
        for (LocalDate data = checkin; !data.isAfter(checkout); data = data.plusDays(1)) {
            for (QuartosPorData qpd : quartos) {
                if (qpd.getData().equals(data)) {
                    QuartosDisponiveis quartosDisponiveis = qpd.getQuartosDisponiveis();
                    return true;
                }
            }
        }
        return false;
    }

    /*
    Para cada item na lista, verifica se a data do registro de quartos é igual a data atual do loop.
    Se encontrar um registro para a data atual, pega os quartos disponiveis para essa data.
    Se houver quartos disponíveis, decrementa a quantidade disponível desse tipo de quarto e encerra o loop.
    Repete o processo para cada data dentro do intervalo, até que todos os dias sejam verificados
    */
    public static void alugarQuarto(TipoQuarto tipo, LocalDate dataInicio, LocalDate dataFim) {
        for (LocalDate data = dataInicio; !data.isAfter(dataFim); data = data.plusDays(1)) {
            for (QuartosPorData quartos : quartos) {
                if (quartos.getData().equals(data)) {
                    QuartosDisponiveis quartosDisponiveis = quartos.getQuartosDisponiveis();
                    int i = tipo.ordinal();
                    if (i >= 0 && i < quartosDisponiveis.getQtdQuartos().size()) {

                        int qtdAtual = quartosDisponiveis.get(i);
                        if (qtdAtual > 0) {
                            quartosDisponiveis.set(i, qtdAtual - 1);
                            break;
                        }
                    }
                }
            }
        }
    }

    public List<QuartosPorData> getQuartosPorData() {
        return quartos;
    }
}

/*
    classe para representar o "no" da lista de quartos do hotel
 */
class QuartosPorData {
    private LocalDate data;
    private QuartosDisponiveis quartosDisponiveis;
    private boolean aceitaCancelamento;

    public QuartosPorData(LocalDate data, QuartosDisponiveis quartosDisponiveis, boolean aceitaCancelamento) {
        setData(data);
        setAceitaCancelamento(aceitaCancelamento);
        setQuartosDisponiveis(quartosDisponiveis);
    }

    // ----- setters -----
    public void setData(LocalDate data) {

        this.data = data;
    }

    public void setAceitaCancelamento(boolean aceitaCancelamento) {
        this.aceitaCancelamento = aceitaCancelamento;
    }

    public void setQuartosDisponiveis(QuartosDisponiveis quartosDisponiveis) {
        if(quartosDisponiveis != null) {
            this.quartosDisponiveis = quartosDisponiveis;
        }
    }

    // ----- getters ------
    public LocalDate getData() {
        return data;
    }
    public QuartosDisponiveis getQuartosDisponiveis() {
        return quartosDisponiveis;
    }
    public boolean getAceitaCancelamento(){
        return aceitaCancelamento;
    }
}







