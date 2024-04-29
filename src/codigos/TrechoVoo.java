package codigos;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TrechoVoo implements Serializable{
        private String codigo;
        private Aeroporto aeroportoOrigem;
        private Aeroporto aeroportoDestino;
        private LocalTime horaSaida;
        private LocalTime horaChegada;
        private CompanhiaAerea companhiaAerea;
        private ArrayList<Voo> voosDisponiveis;

        public TrechoVoo(String codigo, Aeroporto aeroportoOrigem, Aeroporto aeroportoDestino, LocalTime horaSaida, LocalTime horaChegada, CompanhiaAerea companhiaAerea) {
                setCodigo(codigo);
                setAeroportoOrigem(aeroportoOrigem);
                setAeroportoDestino(aeroportoDestino);
                setHoraSaida(horaSaida);
                setHoraChegada(horaChegada);
                setCompanhiaAerea(companhiaAerea);
                this.voosDisponiveis = new ArrayList<>();
        }
        public TrechoVoo(){}

        // ---- setters ----

        public void setCodigo(String codigo) {
           this.codigo = codigo;     
        }

        public void setHoraSaida(LocalTime horaSaida) {
                this.horaSaida = horaSaida;
        }

        public void setHoraChegada(LocalTime horaChegada) {
                this.horaChegada = horaChegada;
        }

        public void setCompanhiaAerea(CompanhiaAerea companhiaAerea) {
                if (companhiaAerea != null) {
                        this.companhiaAerea = companhiaAerea;
                }
        }
        public void setAeroportoOrigem(Aeroporto aeroportoOrigem) {
                if(aeroportoOrigem != null) {
                        this.aeroportoOrigem = aeroportoOrigem;
                }
        }
        public void setAeroportoDestino(Aeroporto aeroportoDestino) {
                if(aeroportoDestino != null) {
                        this.aeroportoDestino = aeroportoDestino;
                }
        }


        // -- getters --
        public String getCodigo() {
                return codigo;
        }
        public LocalTime getHoraSaida() {
                return horaSaida;
        }
        public LocalTime getHoraChegada() {
                return horaChegada;
        }
        public CompanhiaAerea getCompanhiaAerea() {
                return companhiaAerea;
        }
        public ArrayList<Voo> getVoosDisponiveis() {
                return voosDisponiveis;
        }
        public Aeroporto getAeroportoOrigem() {
                return aeroportoOrigem;
        }
        public Aeroporto getAeroportoDestino() {
                return aeroportoDestino;
        }
        public String getAeroportoCidadeOrigem(){
                return aeroportoOrigem.getCidade();
        }
         public String getAeroportoCidaDestino(){
                return aeroportoDestino.getCidade();
        }
        public List<Voo> getVoosDisponiveis(LocalDate data) {
                List<Voo> voosDisponiveisData = new ArrayList<>();
                for (Voo voo : voosDisponiveis) {
                        if (voo.getData().equals(data)) {
                                voosDisponiveisData.add(voo);
                        }
                }
                return voosDisponiveisData;
        }
        
        public Voo buscarVoo(String ID){
            Voo voo = null;
            for (Voo v: voosDisponiveis) {
            if (v.getID().equals(ID)) {
                 voo = v;
                 break;
            }
        }
            return voo;
        }




        // ---- metodos ----

    public static boolean validarCodigo(String codigo) {
        if (codigo.length() != 8) {
             return false;
        }
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(codigo.charAt(i))) {
                return false;
            }
        }
        for (int i = 3; i < 8; i++) {
            if (!Character.isDigit(codigo.charAt(i))) {
                return false;
            }
        }
        return true;
    }

        public void adicionarVooDisponivel(Voo voo) {
                voosDisponiveis.add(voo);
        }
        public boolean atendePesquisa(Pesquisa pesquisa) {
                return aeroportoOrigem.getCidade().equals(pesquisa.getOrigem())
                        && aeroportoDestino.getCidade().equals(pesquisa.getDestino());

        }
}
