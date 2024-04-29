package codigos;
import Dados.DadosTrechosVoo;
import java.util.ArrayList;
import java.util.List;

public abstract class GerenciadorPesquisas {
    private List<Hotel> listaHoteis;


    // ---- metodos ----
    /*
        Percorre a lista de trechos e compara cada trecho com os criterios da pesquisa.
        Se um trecho de voo atender a todos os criterios da pesquisa (como origem, destino e datas),
         ele será adicionado a uma nova lista de "trechos pesquisados", que será retornada no final
     */
    public static List<TrechoVoo> pesquisarVoos(Pesquisa pesquisa) {
        List<TrechoVoo> trechosPesquisados = new ArrayList<>();
        for (TrechoVoo trechoVoo : DadosTrechosVoo.getListaTrechoVoo()) {
            if (trechoVoo.atendePesquisa(pesquisa)) {
                trechosPesquisados.add(trechoVoo);
            }
        }
        return trechosPesquisados;
    }

    public List<Hotel> pesquisarHoteis(Pesquisa pesquisa) {
        List<Hotel> hoteisPesquisados = new ArrayList<>();

        for (Hotel hotel : listaHoteis) {
            if (hotel.getCidade().equalsIgnoreCase(pesquisa.getCidade())) {
                if (hotel.verificarDisponibilidade(pesquisa.getDataInicio(), pesquisa.getDataFim())) {
                    hoteisPesquisados.add(hotel);
                }
            }
        }
        return hoteisPesquisados;
    }

    public List<Voo> pesquisarVoosDisponiveis(TrechoVoo trecho) {
        return trecho.getVoosDisponiveis();
    }


}
