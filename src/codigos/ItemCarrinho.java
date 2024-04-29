package codigos;
import java.time.LocalDate;

public class ItemCarrinho {
    private Object item;
    private int quantidade;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public ItemCarrinho(Object item, int quantidade) {
        setItem(item);
        setQuantidade(quantidade);
    }

    public ItemCarrinho(Object item, int quantidade, LocalDate dataInicio, LocalDate dataFim) {
            setItem(item);
            setQuantidade(quantidade);
            setDataInicio(dataInicio);
            setDataFim(dataFim);
        }

        //---- setters ----
        public void setItem(Object item) {
            if(item != null) {
                this.item = item;
            }
        }

        public void setQuantidade(int quantidade) {
            if(quantidade > 0) {
                this.quantidade = quantidade;
            }
        }
        public void setDataInicio(LocalDate dataInicio) {
            this.dataInicio = dataInicio;
        }

        public void setDataFim(LocalDate dataFim) {
            this.dataFim = dataFim;
        }
        //------ getters -----
        public Object getItem() {
            return item;
        }
        public int getQuantidade() {
         return quantidade;
        }
        public LocalDate getDataInicio() {
            return dataInicio;
        }
        public LocalDate getDataFim() {
            return dataFim;
        }

}